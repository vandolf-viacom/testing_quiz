package com.viacom.testapplication.pages;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.GeneralClickAction;
import android.support.test.espresso.action.GeneralLocation;
import android.support.test.espresso.action.Press;
import android.support.test.espresso.action.Tap;
import android.support.test.rule.ActivityTestRule;

/**
 * Created by Everardo on 3/11/16.
 */

/**
 * This class contains all common functions for all screens.
 */

public abstract class BasePage {

    private ActivityTestRule<? extends Activity> testRule = null;
    private Class<? extends Activity> activityClass = null;
    protected static final boolean ENABLE_SCREENSHOT = false;

    public BasePage(Class<? extends Activity> activityClass) {
        this.testRule = new ActivityTestRule<>(activityClass);
        this.activityClass = activityClass;
    }

    public void launchActivity() {
        this.testRule.launchActivity(new Intent(InstrumentationRegistry.getContext(), this.activityClass));
    }

    public void launchActivity(Class<? extends Activity> activityClass) {
        this.testRule.launchActivity(new Intent(InstrumentationRegistry.getContext(), activityClass));
    }

    public void launchActivity(Intent intent) {
        this.testRule.launchActivity(intent);
    }

    public Activity getActivity() {
        return this.testRule.getActivity();
    }

    public void tearDown() {
        getActivity().finish();
    }


    public final Context getInstrumentationRegistryContext() {
        return InstrumentationRegistry.getContext();
    }

    public void setScreenOrientationLandscape() {
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void setScreenOrientationPortrait() {
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void pressBackButton() {
        Espresso.pressBack();
    }

    /**
     * Check if this device has a camera
     */
    public boolean hasCamera() {
        return getInstrumentationRegistryContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA);
    }

    /**
     * Override longClick() method - Increase Tap.LONG duration from 1.5 times to 2 times
     */
    public static ViewAction longClick() {
        return new GeneralClickAction(Tap.LONG, GeneralLocation.CENTER, Press.PINPOINT);
    }

}

package com.viacom.testapplication.pages;

import android.app.Activity;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;

import com.viacom.testapplication.R;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

/**
 * Created by Everardo on 3/11/16.
 */

/**
 * This class represents the MainActivity screen and functions.
 */
public class MainActivityPage extends BasePage {

    public MainActivityPage(Class<? extends Activity> activityClass) {
        super(activityClass);
    }

    public void tapAddWaterBtn() {
        Espresso.onView(withId(R.id.add_water)).perform(click());
    }

    public void isDisplayed(int rsid) {
        Espresso.onView(withId(rsid)).check(matches(ViewMatchers.isDisplayed()));
    }

    public void isDisplayed(int rsid, String txt) {
        Espresso.onView(withId(rsid)).check(matches(withText(txt)));
    }

    public void waterCheckboxIsChecked() {
        Espresso.onView(withId(R.id.tank_is_full_indicator)).check(matches(isChecked()));
    }

    public void waterCheckboxIsUnchecked() {
        Espresso.onView(withId(R.id.tank_is_full_indicator)).check(matches(not(isChecked())));
    }
}

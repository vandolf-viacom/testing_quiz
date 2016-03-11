package com.viacom.testapplication.tests;

import com.viacom.testapplication.MainActivity;
import com.viacom.testapplication.R;
import com.viacom.testapplication.pages.MainActivityPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Everardo on 3/11/16.
 */

/**
 * This class contains all testcases related to the MainActivity
 */
public class MainActivityTest extends BaseTest {

    // Instantiate MainActivityPage Object
    private MainActivityPage mainActivityPage = new MainActivityPage(MainActivity.class);

    @Before
    public void setUp() {
        mainActivityPage.launchActivity();      // Launch Main Activity
    }

    /**
     * Testcase: Verify Main Activity is displayed.
     */
    @Test
    public void mainActivityIsDisplayed() {
        mainActivityPage.isDisplayed(R.id.main_activity);
    }


    /**
     * Testcase: Verify 'Add Water' button is displayed.
     */
    @Test
    public void addWaterButtonIsDisplayed() {
        mainActivityPage.isDisplayed(R.id.add_water);
    }

    /**
     * Testcase: Verify 'Tank' is full.
     */
    @Test
    public void verifyTankIsFull() {
        mainActivityPage.isDisplayed(R.id.add_water);
        mainActivityPage.isDisplayed(R.id.tank_is_full_indicator_label);
        mainActivityPage.tapAddWaterBtn();
        mainActivityPage.isDisplayed(R.id.current_amount_in_liters, "100");
        mainActivityPage.isDisplayed(R.id.tank_is_full_indicator_label);
        mainActivityPage.waterCheckboxIsUnchecked();
        mainActivityPage.tapAddWaterBtn();
        mainActivityPage.isDisplayed(R.id.current_amount_in_liters, "200");
        mainActivityPage.isDisplayed(R.id.tank_is_full_indicator_label);
        mainActivityPage.waterCheckboxIsUnchecked();
        mainActivityPage.tapAddWaterBtn();
        mainActivityPage.isDisplayed(R.id.current_amount_in_liters, "300");
        mainActivityPage.isDisplayed(R.id.tank_is_full_indicator_label);
        mainActivityPage.waterCheckboxIsUnchecked();
        mainActivityPage.tapAddWaterBtn();
        mainActivityPage.isDisplayed(R.id.current_amount_in_liters, "400");
        mainActivityPage.isDisplayed(R.id.tank_is_full_indicator_label);
        mainActivityPage.waterCheckboxIsUnchecked();
        mainActivityPage.tapAddWaterBtn();
        mainActivityPage.isDisplayed(R.id.current_amount_in_liters, "500");
        mainActivityPage.isDisplayed(R.id.tank_is_full_indicator_label);
        mainActivityPage.waterCheckboxIsChecked();
    }

    /**
     * Testcase: Verify 'First Tap' button is clicked.
     */
    @Test
    public void tankCheckboxIsUnchecked() {
        mainActivityPage.isDisplayed(R.id.tank_is_full_indicator_label);
        mainActivityPage.waterCheckboxIsUnchecked();

    }

    /**
     * Testcase: Verify 'Tank is full' text is displayed.
     */
    @Test
    public void tankTextIsDisplayed() {
        mainActivityPage.isDisplayed(R.id.tank_is_full_indicator_label);
    }

    @After
    public void tearDown() {
        // Any code that needs to run after every test
    }

}

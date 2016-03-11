package com.viacom.testapplication;


import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentationTest {

    // TODO Write tests using JUnit4, Mockito, and Robolectric
    // Write as many tests as necessary as well as ensuring tests are clean and understandable

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void removeMe() throws Exception {
        onView(withId(R.id.main_activity))
                .check(ViewAssertions.matches(isDisplayed()));
    }
}

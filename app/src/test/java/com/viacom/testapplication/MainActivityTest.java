package com.viacom.testapplication;

import android.os.Build;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class MainActivityTest {

    // TODO Write tests using JUnit4, Mockito, and Robolectric
    // Write as many tests as necessary as well as ensuring tests are clean and understandable

    @Test
    public void removeMe() throws Exception {
        assertThat(1 + 1, equalTo(2));
    }

}

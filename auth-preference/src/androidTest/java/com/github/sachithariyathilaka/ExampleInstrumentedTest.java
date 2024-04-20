package com.github.sachithariyathilaka;

import static org.junit.Assert.assertNotNull;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Collections;
import java.util.List;

import com.github.sachithariyathilaka.resource.Header;
import com.github.sachithariyathilaka.resource.UserDetail;

/**
 * Instrumented test for the library.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/03/24
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    private final Context context = InstrumentationRegistry.getInstrumentation().getTargetContext();
    private final UserDetail userDetail = new UserDetail("USER-01", true);
    private final List<Header> headers = Collections.singletonList(new Header("meta", "This is meta data"));

    /**
     * Save user detail test.
     */
    @Test
    public void saveUserDetailsTest() {
        AuthPreference.saveUserDetails(context, userDetail);
    }

    /**
     * Get user detail test.
     */
    @Test
    public void getUserDetailsTest() {
        assertNotNull(AuthPreference.getUserDetails(context));
    }

    /**
     * Save user header test.
     */
    @Test
    public void saveUserHeaderTest() {
        AuthPreference.saveHeaders(context, headers);
    }

    /**
     * Get user header test.
     */
    @Test
    public void getHeaderTest() {
        assertNotNull(AuthPreference.getHeaders(context, Collections.singletonList("meta")));
    }
}
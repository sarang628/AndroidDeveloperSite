package com.sarang.androiddeveloper;

import android.content.Context;
import android.location.LocationManager;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 Instrumented test, which will execute on an Android device.

 @see <a href="http://d.android.com/tools/testing">Testing documentation</a> */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.sarang.androiddeveloper", appContext.getPackageName());
    }

    @Test
    public void contextTest() {
        System.out.println("!!!!!!!!!! contextTest");
        Context appContext = InstrumentationRegistry.getTargetContext();
        String name = appContext.getSystemServiceName(LocationManager.class);
        Log.d("sarang!", name);
        System.out.println("!!!!!!!!!!" + appContext.getSystemServiceName(LocationManager.class));
    }
}

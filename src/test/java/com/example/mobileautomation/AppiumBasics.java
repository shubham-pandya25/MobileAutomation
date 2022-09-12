package com.example.mobileautomation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;


public class AppiumBasics extends BaseTest {

    @Test
    public void WifiSettingsName()throws MalformedURLException {

        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

    }
}



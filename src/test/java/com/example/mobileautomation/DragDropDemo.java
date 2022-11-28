package com.example.mobileautomation;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class DragDropDemo extends BaseTest{

    @Test

    public void DragDropDemo() throws MalformedURLException, InterruptedException
    {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

    }
}

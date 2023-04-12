package com.example.mobileautomation;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AndroidPractice extends BaseTest {

    @Test
    public void CancelWithMessage() {

        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
        driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
    }

}

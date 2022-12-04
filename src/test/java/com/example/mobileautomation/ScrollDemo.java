package com.example.mobileautomation;


import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

public class ScrollDemo extends BaseTest{

    @Test

    public void ScrollDemo() throws MalformedURLException, InterruptedException
    {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        //where to scroll is known prior
        //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
        //No prior idea where to scroll

        scrollToEndAction();
    }

}

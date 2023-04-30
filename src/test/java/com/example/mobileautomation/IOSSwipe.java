package com.example.mobileautomation;
import io.appium.java_client.AppiumBy;
import org.apache.commons.collections.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IOSSwipe extends IOSBaseTest{

    @Test
    public void IOSSwipeTest()

    {
        //Bundle ID
        Map<String, String> params = new HashMap<String, String>();
        params.put("bundleId", "com.apple.mobileslideshow");
        driver.executeScript("mobile:launchApp", params);
    //    driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND value '1'")).click();
    //    driver.findElement(By.xpath("//XCUIElementTypeButton[@name='All Photos']")).click();

        List<WebElement> allPhotos = driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeCell"));
        System.out.println(allPhotos.size());
        driver.findElement(By.xpath("//XCUIElementTypeCell[1]")).click();

        for (int i =0; i<allPhotos.size();i++);


        Map<String,Object>params1 = new HashMap<String,Object> ();
        params1.put("direction","left");
        driver.executeScript("mobile:swipe", params1);
        driver.findElement(AppiumBy.accessibilityId("Albums")).click();

    }

}

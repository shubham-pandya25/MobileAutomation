package com.example.mobileautomation;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IOSBasics extends IOSBaseTest{

    @Test
    public void IOSBasicsTest()

    {
        //Xpath, classname, IOS, iosClassChain, IOS PredicateString, accessibility id, id

        driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
        //Xpath --
      //  driver.findElement(By.xpath("//XCUIElementTypeStatucText[@name='Text Entry']")).click();
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label =='Text Entry'`]")).click();

        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeCell")).sendKeys("Hello World");

        driver.findElement(AppiumBy.accessibilityId("OK")).click();
       // driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value == 'Confirm / Cancel'"));

        driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value BEGINSWITH[c] 'Confirm'")).click();

        String Message = driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value BEGINSWITH[c] 'A message'")).getText();
        System.out.println(Message);

        //driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value ENDSWITH[c] 'Cancel'"));

        driver.findElement(AppiumBy.iOSNsPredicateString("label == 'Confirm'")).click();
    }

}

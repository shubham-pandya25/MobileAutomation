package com.example.mobileautomation;

import io.appium.java_client.AppiumBy;
import org.testng.Assert;
import org.testng.annotations.Test;

 public class practice extends BaseTest {

    @Test

    public void ActionBarTabs() {

        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Action Bar")).click();
        driver.findElement(AppiumBy.accessibilityId("Action Bar Tabs")).click();

        String newtab = driver.findElement(AppiumBy.accessibilityId("Add new tab")).getText();
        String removelasttab = driver.findElement(AppiumBy.accessibilityId("Remove last tab")).getText();
        String toggletabmode = driver.findElement(AppiumBy.accessibilityId("Toggle tab mode")).getText();
        String removealltabs = driver.findElement(AppiumBy.accessibilityId("Remove all tabs")).getText();

        Assert.assertEquals(newtab, "Add new tab");
        Assert.assertEquals(removelasttab, "Remove last tab");
        Assert.assertEquals(toggletabmode, "Toggle tab mode");
        Assert.assertEquals(removealltabs, "Remove all tabs");
    }

    @Test

    public void  ActionBarMechanics() {

        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Action Bar")).click();
        driver.findElement(AppiumBy.accessibilityId("Action Bar Mechanics")).click();
    }

     @Test

     public void  BarMechanics() {

         driver.findElement(AppiumBy.accessibilityId("App")).click();
         driver.findElement(AppiumBy.accessibilityId("Action Bar")).click();
         driver.findElement(AppiumBy.accessibilityId("Action Bar Mechanics")).click();
     }

}

package com.example.mobileautomation;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class e_commerce_tc2 extends BaseTest{

    @Test public void FillForm() throws InterruptedException
    {
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Shubham Pandya");
        driver.hideKeyboard();
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));

     int productCount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
     for (int i = 0;i<productCount;i++)
     {
         String productName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
         if (productName.equalsIgnoreCase("Jordan 6 Rings"))
         {
             driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
         }
     }
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
     Thread.sleep(3000);
    }


}

package com.example.mobileautomation;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BrowserBaseTest {

    public AndroidDriver driver;

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel XL API 32");
        options.setChromedriverExecutable("//Users//shubhampandya//Downloads//chromedriver");
        options.setCapability("browserName", "Chrome");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public Double getFormattedAmount(String amount)
    {
        Double price = Double.parseDouble(amount.substring(1));
        return price;
    }


}

package com.example.mobileautomation;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IOSBaseTest {

    public IOSDriver driver;

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {

        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone SE (3rd generation)");
     //   options.setApp("/Users/shubhampandya/demo/MobileAutomation/src/test/java/resources/UIKitCatalog.app");
        options.setApp("/Users/shubhampandya/demo/MobileAutomation/src/test/java/resources/TestApp 3.app");
        options.setPlatformVersion("16.4");
        //Appium-Webdriver Agent -> IOS apps
        options.setWdaLaunchTimeout(Duration.ofSeconds(20));

        driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



    }

}

package com.web.selenium;

import com.web.selenium.constants.SeleniumConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSelenium {
    public static void main(String[] args) {
        System.setProperty(SeleniumConstants.DriverConstants.CHROME_DRIVER_KEY,SeleniumConstants.DriverConstants.CHROME_DRIVER_VALUE);
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to(SeleniumConstants.URLConstants.GOOGLE_URL);
    }
}

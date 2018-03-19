package com.web.selenium.constants;

public enum SeleniumConstants {

    SELENIUM_CONSTANTS, SELENIUM_HELLO,SELENIUM_HELLO_NAME;

    public static interface DriverConstants{
        public static final String CHROME_DRIVER_KEY = "webdriver.chrome.driver";
        public static final String CHROME_DRIVER_VALUE = "driver\\chrome\\chromedriver.exe";
    }

    public static interface URLConstants {
        public static final String GOOGLE_URL = "http://www.google.co.in";
    }
}

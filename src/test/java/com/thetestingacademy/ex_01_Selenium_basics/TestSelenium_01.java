package com.thetestingacademy.ex_01_Selenium_basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium_01 {
    public static void main(String[] args) {
        // If you are using selenium 3.14

        // System.setProperty("webdriver.edge.driver", "C://Users/promode/Downloads/edgedriver_win64/msedgedriver.exe");
//        // Firefox
//        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
//        // Chrome
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
//        // IE
//        System.setProperty("webdriver.ie.driver", "path/to/IEDriverServer.exe");
//        // Safari
//        System.setProperty("webdriver.safari.driver", "path/to/safaridriver");

        // Selenium 4.x - Selenium Manager - will automatically download the Drivers all
        // when needed when you start the Selenium server.


        FirefoxDriver driver = new FirefoxDriver();
        // new FirefoxDriver(); - This START of the Selenium Session
        // Session - Fresh copy of browser is started!.
        // POST request to the Server - Firefox Driver.

        driver.get("https://sdet.live");
        // Command number 2 - POST request to give to the driver to navigate to a URL
    }
}

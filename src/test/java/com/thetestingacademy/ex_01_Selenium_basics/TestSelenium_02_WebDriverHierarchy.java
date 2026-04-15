package com.thetestingacademy.ex_01_Selenium_basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSelenium_02_WebDriverHierarchy {
    public static void main(String[] args) {
        // Webdriver hierarchy
        // SearchContext(I) -> (2) -> WebDriver(I)( ~10) -> RemoteWebDriver(C) (~15)
        //// -> ChromiumDriver(C) ~25 -> EdgeDriver(C) (~45)

        // SearchContext - Interface - findElement, and findElements - GGF
        // WebDriver - Interface - some incomplete functions - GF
        // RemoteWebDriver - Class- It also has some functions - F
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S

        SearchContext driver = new ChromeDriver();
        SearchContext driver1 = new FirefoxDriver();
        SearchContext driver2 = new EdgeDriver();

        WebDriver driver3 = new ChromeDriver();
        WebDriver driver4 = new FirefoxDriver();

        RemoteWebDriver driver5 = new FirefoxDriver();
        FirefoxDriver driver6 = new FirefoxDriver();

        // Scenarios
        // // 1. Do want to run only on  Chrome or Edge?
        //ChromeDriver driver2 = new ChromeDriver();


        // 2  Do you want to run on Chrome then change to Edge ?
       // WebDriver driver = new ChromeDriver();
//        driver = new EdgeDriver(); // 97% -
//        driver = new FirefoxDriver(); // 97% -
//        driver = new SafariDriver(); // 97% -


        // 3. Do you want to run on multiple browsers, aws machine? 2%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)




    }
}

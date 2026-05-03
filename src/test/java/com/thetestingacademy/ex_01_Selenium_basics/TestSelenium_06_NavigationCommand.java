package com.thetestingacademy.ex_01_Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium_06_NavigationCommand {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com"); //you will use this 95% of the time

       // driver.close();

        driver.navigate().to("https://www.youtube.com/");

        driver.navigate().back();
       // driver.navigate().forward();
        driver.navigate().refresh();

        driver.quit();


    }
}

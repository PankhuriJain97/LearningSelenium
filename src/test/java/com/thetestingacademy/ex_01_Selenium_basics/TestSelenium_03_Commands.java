package com.thetestingacademy.ex_01_Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium_03_Commands {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); //to maximize

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        String title = driver.getTitle();

        if(title.equalsIgnoreCase("CURA Healthcare Service"))
        {
            System.out.println("Text is present");
        }
        else
        {
            System.out.println("Text is not present");
        }

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.manage().window().minimize();

        driver.quit();
    }
}

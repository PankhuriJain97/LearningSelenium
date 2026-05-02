package com.thetestingacademy.ex_01_Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_05_TestNG_Example {

    @Test
    public void Test_app()
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); //to maximize

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        String title = driver.getTitle();

        Assert.assertEquals(title,"CURA Healthcare Service");

        driver.quit();

    }
}

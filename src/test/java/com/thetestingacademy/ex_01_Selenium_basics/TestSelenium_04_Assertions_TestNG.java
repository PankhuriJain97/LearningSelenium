package com.thetestingacademy.ex_01_Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium_04_Assertions_TestNG {

    @Test
    public void test_Selenium_01()  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //TestNG
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");


        //AssertJ - we can group multiple assertions

        assertThat(driver.getCurrentUrl()).isNotEmpty().isNotNull().isEqualTo("https://www.google.com/");




        driver.quit();

    }
}

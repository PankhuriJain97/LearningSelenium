package com.thetestingacademy.ex_02_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium08_LinkText_Partial_Text_Locators {

    @Description("Verify start free trial functionality")
    @Test

    public void test_02() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //1.open the url
        driver.get("https://app.vwo.com/#/login");

        /**
        * If you have an anchor tag and a text you can access that element in below 2 ways
         **/

        //    // linkText - Full Text match
        //    // partialLinkText - Partial Match


        //for complete match
        // WebElement trial_but = driver.findElement(By.linkText("Start a FREE TRIAL"));

        // trial_but.click();

        WebElement partial = driver.findElement(By.partialLinkText("FREE TRIAL"));

        partial.click();

        Thread.sleep(5000);

        driver.quit();

    }
}

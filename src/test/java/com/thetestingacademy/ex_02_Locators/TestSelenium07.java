package com.thetestingacademy.ex_02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium07 {

    @Test
    public void test_01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //1.open the url
        driver.get("https://app.vwo.com/#/login");

        //locate the elements and perform actions

        driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");

        driver.findElement(By.id("login-password")).sendKeys("admin");

        driver.findElement(By.id("js-login-btn")).click();

        //3.add wait time after performing click so that elements can be loaded
        Thread.sleep(5000);

      WebElement element = driver.findElement(By.id("js-notification-box-msg"));

      //4. Assertion

        Assert.assertEquals(element.getText(),"Your email, password, IP address or location did not match");

        driver.quit();
    }
}

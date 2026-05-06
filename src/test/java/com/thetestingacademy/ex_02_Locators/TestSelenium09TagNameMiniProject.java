package com.thetestingacademy.ex_02_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium09TagNameMiniProject {

    @Description("negative scenario for free trial")
    @Owner("Pankhuri")
    @Test

    public void test_03() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");

        driver.findElement(By.id("page-v1-step1-email")).sendKeys("admin@admin.com");
        driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox")).click();

        driver.findElement(By.tagName("button")).click();

        Thread.sleep(2000);

        WebElement element = driver.findElement(By.className("invalid-reason"));

        Assert.assertEquals(element.getText(),"admin.com doesn't look like a business domain. Please use your business email.");


    }

}

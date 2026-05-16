package com.thetestingacademy.ex_07_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium16ImplicitWait {

    @Test

    public void selenium_waits()
    {
        WebDriver driver = new ChromeDriver();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://app.vwo.com/#/login");
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("password@321");


        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();
    }
}

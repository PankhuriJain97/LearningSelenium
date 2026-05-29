package com.thetestingacademy.ex_14_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium35TimeoutException {

    @Test
    public void timeout_exception()
    {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("randomid")));

        WebElement element = driver.findElement(By.id("APjFqb"));
    }
}

package com.thetestingacademy.ex_14_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium34StaleElementReference {

    @Test
    public void exception_stale_element()
    {
        try {
            WebDriver driver = new FirefoxDriver();

            driver.get("https://www.google.com/");

            WebElement element = driver.findElement(By.id("APjFqb"));

            driver.navigate().refresh(); // HTML DOM is now refreshed
            //driver will now think that the element may or may not be found
            //element was located before refresh hence it becomes stale after refresh

            element = driver.findElement(By.id("APjFqb"));

            element.sendKeys("hello");
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
    }
}

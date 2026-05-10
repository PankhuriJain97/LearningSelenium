package com.thetestingacademy.ex_04_XPath_Axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium12XPathAxes {

    @Test

    public void xpath_axes()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");


        WebElement element = driver.findElement(By.xpath("//textarea[@title='Search']/parent::div"));

    }
}

package com.thetestingacademy.ex_12_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSelenium30Windows01 {

    @Test

    public void windows()
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        String parentid = driver.getWindowHandle();

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> ids = driver.getWindowHandles();

        for(String id : ids)
        {
            driver.switchTo().window(id);
            if(driver.getPageSource().contains("New Window"))
            {
                System.out.println("Test passed");
            }
        }

        driver.switchTo().window(parentid);
    }
}

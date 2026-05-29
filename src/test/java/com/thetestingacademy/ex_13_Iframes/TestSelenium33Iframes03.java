package com.thetestingacademy.ex_13_Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium33Iframes03 {

    @Test
    public void iframes()
    {
        WebDriver driver = new ChromeDriver();

        IframeUtils iframeUtils = new IframeUtils(driver);

        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");

        driver.manage().window().maximize();

        //driver.switchTo().frame("result");
        iframeUtils.switchToFrame("result");

        driver.findElement(By.id("username")).sendKeys("user1");

        //driver.switchTo().defaultContent(); //switches back to original frame

        iframeUtils.switchToDefault();
    }
}

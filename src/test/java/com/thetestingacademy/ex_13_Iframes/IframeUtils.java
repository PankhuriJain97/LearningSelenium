package com.thetestingacademy.ex_13_Iframes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IframeUtils {

    WebDriver driver;

    public IframeUtils(WebDriver driver)
    {
        this.driver = driver;
    }


    public void switchToDefault()
    {
        driver.switchTo().defaultContent();
    }

    public void switchToParent()
    {
        driver.switchTo().parentFrame();
    }

    public void switchToFrame(String FrameId)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameId));
    }

    public void switchToFrame(String FrameId,Integer time)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameId));
    }
}

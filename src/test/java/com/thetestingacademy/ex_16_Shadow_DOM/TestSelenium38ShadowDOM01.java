package com.thetestingacademy.ex_16_Shadow_DOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium38ShadowDOM01 {

    @Test

    public void shadow_dom()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/iframe-in-shadow-dom/");

        //unable to find using below since it is in shadow root
        //input[@id="kils"]

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement inputbox = (WebElement) js.executeScript("return document.querySelector('div.jackPart').shadowRoot.querySelector('input#kils')");

        inputbox.sendKeys("user123");

    }
}

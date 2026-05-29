package com.thetestingacademy.ex_13_Iframes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium32Iframes02practice {

    @Test
    public void selector_hub()
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
    }
}

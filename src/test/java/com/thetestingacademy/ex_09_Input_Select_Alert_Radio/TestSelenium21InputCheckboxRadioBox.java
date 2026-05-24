package com.thetestingacademy.ex_09_Input_Select_Alert_Radio;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium21InputCheckboxRadioBox extends CommonToAll {

    @Test
    public void InputCheckboxRadioBox()
    {
        WebDriver driver = new ChromeDriver();
        OpenBrowser(driver,"https://awesomeqa.com/practice.html");

        WebElement firstname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        firstname.sendKeys("the testing academy");

        // RADIO Box
        WebElement radiobox = driver.findElement(By.id("sex-1"));
        radiobox.click();

        // CheckBox
        driver.findElement(By.id("tool-1")).click();
    }
}

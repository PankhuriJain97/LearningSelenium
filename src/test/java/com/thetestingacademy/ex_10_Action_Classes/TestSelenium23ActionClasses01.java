package com.thetestingacademy.ex_10_Action_Classes;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium23ActionClasses01 extends CommonToAll {

    @Test

    public void action_classes()
    {
        WebDriver driver = new ChromeDriver();
        OpenBrowser(driver,"https://awesomeqa.com/practice.html");

        WebElement element = driver.findElement(By.name("firstname"));

        Actions action = new Actions(driver);

        action.keyDown(Keys.SHIFT).sendKeys(element,"Pankhuri").keyUp(Keys.SHIFT).build().perform();
    }
}

package com.thetestingacademy.ex_10_Action_Classes;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium27DragandDrop extends CommonToAll {

    @Test
    public void drag_and_drop()
    {
        WebDriver driver = new ChromeDriver();

        OpenBrowser(driver, "https://the-internet.herokuapp.com/drag_and_drop");

        Actions actions = new Actions(driver);
        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));
        actions.dragAndDrop(from,to).build().perform();
    }
}

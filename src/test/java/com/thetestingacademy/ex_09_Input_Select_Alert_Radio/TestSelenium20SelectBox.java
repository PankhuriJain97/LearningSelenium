package com.thetestingacademy.ex_09_Input_Select_Alert_Radio;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelenium20SelectBox extends CommonToAll {

    @Test
    public void drop_down() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        OpenBrowser(driver,"https://the-internet.herokuapp.com/dropdown");

        WebElement element = driver.findElement(By.id("dropdown"));

        Select sel = new Select(element);

        sel.selectByValue("1");

        sel.selectByIndex(2);

        sel.selectByVisibleText("Option 1");

        driver.quit();

    }
}

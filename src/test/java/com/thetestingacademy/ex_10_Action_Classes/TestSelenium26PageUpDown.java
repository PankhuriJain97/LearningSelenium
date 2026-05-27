package com.thetestingacademy.ex_10_Action_Classes;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium26PageUpDown extends CommonToAll {

    @Test

    public void page_up_down()
    {
        WebDriver driver = new ChromeDriver();

        OpenBrowser(driver,"https://thetestingacademy.com/");

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_UP).build().perform();
    }
}

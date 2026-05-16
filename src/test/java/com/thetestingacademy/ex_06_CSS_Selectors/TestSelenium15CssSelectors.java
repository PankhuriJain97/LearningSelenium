package com.thetestingacademy.ex_06_CSS_Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium15CssSelectors {

    @Test
    public void css_practice()
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://awesomeqa.com/css/");

        driver.manage().window().maximize();

        //by class
        String el1 = driver.findElement(By.cssSelector(".first")).getText();

        System.out.println(el1);
        System.out.println("####################################################");

        //parent-child gives the first span child
        String el2 = driver.findElement(By.cssSelector(".first>span")).getText();

        System.out.println(el2);
        System.out.println("####################################################");

        //pseudo classes
        String el3 = driver.findElement(By.cssSelector(".first span:nth-child(3)")).getText();
        System.out.println(el3);
        System.out.println("####################################################");

        //adjacent sibling
        String el4 = driver.findElement(By.cssSelector(".first span+span")).getText();
        System.out.println(el4);


    }
}

package com.thetestingacademy.ex_03_XPath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium11MiniProj03 {

    @Description("Verify Login functionality")
    @Owner("Pankhuri")
    @Severity(SeverityLevel.CRITICAL)
    @Test

    public void login_heroku_app() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.findElement(By.id("btn-make-appointment")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id = 'txt-username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("Hacker@4321");

        driver.findElement(By.xpath("//button")).click();

        Thread.sleep(3000);

//        List<WebElement> alt_images = driver.findElements(By.xpath("//img[starts-with(@alt,\"Image\")]"));
//
//        alt_images.get(0).click();




    }
}

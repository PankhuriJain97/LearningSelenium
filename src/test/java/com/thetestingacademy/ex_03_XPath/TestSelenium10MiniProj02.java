package com.thetestingacademy.ex_03_XPath;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSelenium10MiniProj02 {

    @Description("Verify Login functionality")
    @Owner("Pankhuri")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

        Thread.sleep(2000);

        WebElement user_name =driver.findElement(By.xpath("//input[@name = 'username']"));

        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));

        user_name.sendKeys("admin");
        pass.sendKeys("Hacker@4321");

        driver.findElement(By.tagName("button")).click();

        Thread.sleep(5000);

        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/hr/web/index.php/pim/viewEmployeeList");

        driver.quit();
    }

}

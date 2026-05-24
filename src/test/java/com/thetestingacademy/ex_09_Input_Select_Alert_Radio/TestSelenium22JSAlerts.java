package com.thetestingacademy.ex_09_Input_Select_Alert_Radio;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium22JSAlerts extends CommonToAll {

    @Test
    public void JSAlerts()
    {
        WebDriver driver = new ChromeDriver();
        OpenBrowser(driver, "https://the-internet.herokuapp.com/javascript_alerts");

        WebElement element = driver.findElement(By.xpath("//button[@onclick ='jsAlert()']"));

        element.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert =  driver.switchTo().alert();
        alert.accept();

        WebElement elementconfirm = driver.findElement(By.xpath("//button[@onclick ='jsConfirm()']"));

        elementconfirm.click();
        wait.until(ExpectedConditions.alertIsPresent());

        alert.dismiss();

        WebElement prompt = driver.findElement(By.xpath("//button[@onclick ='jsPrompt()']"));
        prompt.click();
        wait.until(ExpectedConditions.alertIsPresent());


        alert.sendKeys("Pankhuri");
        alert.accept();

        String text = driver.findElement(By.id("result")).getText();

        Assert.assertEquals(text,"You entered: Pankhuri");

    }


}

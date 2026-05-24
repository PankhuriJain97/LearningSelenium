package com.thetestingacademy.ex_10_Action_Classes;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium24Spicejet extends CommonToAll {

    @Test
    public void spicejet()
    {
        WebDriver driver = new ChromeDriver();

        OpenBrowser(driver,"https://www.spicejet.com/");

        WebElement from = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));
        WebElement to = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div/div/input"));

//        from.sendKeys("DEL");
//        to.sendKeys("BLR");

        Actions actions = new Actions(driver);
        actions
                .moveToElement(from).click().sendKeys("BLR")
                .moveToElement(to).sendKeys("DEL")
                .build().perform();
    }
}

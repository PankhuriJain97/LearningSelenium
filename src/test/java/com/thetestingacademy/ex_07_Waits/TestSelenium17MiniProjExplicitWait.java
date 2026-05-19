package com.thetestingacademy.ex_07_Waits;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium17MiniProjExplicitWait extends CommonToAll {

    @Test

    public void mmt_test()
    {
        WebDriver driver = new ChromeDriver();

       // driver.get("https://www.makemytrip.com/");

        OpenBrowser(driver,"https://www.makemytrip.com/");

        //explicit wait
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));


        //using common method
        WaitUntil(driver,10,"//span[@data-cy='closeModal']");

        ClickElementFound("//span[@data-cy='closeModal']");
//        WebElement element = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
//        element.click();

        driver.quit();
    }
}

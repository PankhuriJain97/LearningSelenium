package com.thetestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonToAll {

    public ChromeDriver driver;

    public void OpenBrowser(WebDriver driver, String url)
    {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void CloseBrowser(WebDriver driver)
    {
        driver.quit();
    }

    public void WaitUntil(WebDriver driver, int time, String locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void ClickElementFound(String xpath)
    {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }

    public void waitForTextToBePresent(WebDriver driver, int timeInSeconds,String xpath,String text){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(xpath)),text));
    }

    public void waitForAlert(WebDriver driver, int timeInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.alertIsPresent());
    }


}

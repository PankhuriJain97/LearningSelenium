package com.thetestingacademy.ex_11_File_Upload;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium28FileUpload extends CommonToAll {

    @Test
    public void file_upload()
    {
        WebDriver driver = new ChromeDriver();

        OpenBrowser(driver, "https://awesomeqa.com/selenium/upload.html");

        WebElement element = driver.findElement(By.id("fileToUpload"));
        element.sendKeys("D:/LearningSelenium/LearningSelenium/src/test/java/com/thetestingacademy/ex_11_File_Upload/test");

        driver.findElement(By.name("submit")).click();
    }
}

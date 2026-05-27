package com.thetestingacademy.ex_11_File_Upload;

import com.thetestingacademy.CommonToAll;
import com.thetestingacademy.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium29Practice extends CommonToAll {

    @Test

    public void practice_upload()
    {
        WebDriver driver = new ChromeDriver();
        OpenBrowser(driver,"https://app.thetestingacademy.com/student/dashboard");

        WaitHelpers.checkVisibility(driver,By.xpath("//button[contains(@class,'cl-socialButtonsBlockButton')]"),3);

        driver.findElement(By.xpath("//button[contains(@class,'cl-socialButtonsBlockButton')]")).click();
    }
}

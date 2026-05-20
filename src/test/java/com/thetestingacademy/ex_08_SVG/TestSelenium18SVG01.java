package com.thetestingacademy.ex_08_SVG;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium18SVG01 extends CommonToAll {

    @Test
    public void flipkart_search()
    {
        WebDriver driver = new ChromeDriver();
        OpenBrowser(driver, "https://www.flipkart.com/search");

        driver.findElement(By.name("q")).sendKeys("macmini");

        List<WebElement> elementList = driver.findElements(By.xpath("//*[local-name() = 'svg']"));

        elementList.get(0).click();

        WaitUntil(driver,10,"//a[contains(@title , 'Apple Mac Mini')]");
        List<WebElement> prods = driver.findElements(By.xpath("//*[@class = 'pIpigb']"));

        for(int i = 0; i< prods.size(); i++)
        {
            System.out.println(prods.get(i).getText());
        }

        driver.quit();

    }
}

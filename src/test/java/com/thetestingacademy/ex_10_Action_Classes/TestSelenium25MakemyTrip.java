package com.thetestingacademy.ex_10_Action_Classes;

import com.thetestingacademy.CommonToAll;
import com.thetestingacademy.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium25MakemyTrip extends CommonToAll {

    @Test

    public void mmt_flights() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        OpenBrowser(driver,"https://www.makemytrip.com/");

        WaitHelpers.checkVisibility(driver,By.xpath("//span[@data-cy='closeModal']"),5);

        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

        // just to remove the transparent layer.
        WebElement background_element = driver.findElement(By.tagName("body"));
        background_element.click(); // just to remove the transparent layer.

        WebElement element = driver.findElement(By.xpath("//li[@data-cy='menu_Flights']"));

        element.click();

        Thread.sleep(3000);

        WebElement from = driver.findElement(By.xpath("//input[@data-cy='fromCity']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(from).click().build().perform();

        Thread.sleep(2000);

        actions.moveToElement(from).click().sendKeys("DEL").build().perform();

        //driver.findElement(By.xpath("//span[text() = 'New Delhi, India']")).click();

        Thread.sleep(2000);

        try{
            List<WebElement> places = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));

            for(WebElement place : places)
            {
                if(place.getText().contains("New Delhi"))
                {
                    place.click();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Thread.sleep(2000);

        WebElement to = driver.findElement(By.xpath("//input[@data-cy='toCity']"));

        actions.moveToElement(to).click().sendKeys("tok").build().perform();

        Thread.sleep(2000);

        try{
            List<WebElement> places = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));

            for(WebElement place : places)
            {
                if(place.getText().contains("Tokyo"))
                {
                    place.click();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}

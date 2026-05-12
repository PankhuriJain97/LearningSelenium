package com.thetestingacademy.ex_05_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium14Webtables02 {

    @Test

    public void dyn_webtable()
    {
        WebDriver driver = new ChromeDriver();

        //table[@summary = "Sample Table"]/tbody/tr[i]/th[j]

        driver.get("https://awesomeqa.com/webtable1.html");

        WebElement table_head = driver.findElement(By.xpath("//table[@summary='Sample Table']/thead"));
        WebElement table_footer = driver.findElement(By.xpath("//table[@summary='Sample Table']/tfoot"));

        System.out.println(table_head.getText());
        System.out.println(table_footer.getText());

        WebElement table = driver.findElement(By.xpath("//table[@summary = 'Sample Table']/tbody"));

        List<WebElement> row_table = table.findElements(By.tagName("tr"));

        for(int i = 0; i<row_table.size(); i++)
        {
            List<WebElement> col = row_table.get(i).findElements(By.tagName("td"));

            for(WebElement j : col)
            {
                System.out.println(j.getText());
            }
        }


        driver.quit();
    }

}

package com.thetestingacademy.ex_05_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium13Webtables01 {

    @Test
    public void WebTable()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");

        driver.manage().window().maximize();

        //table[@id = "customers"]/tbody/tr[5]/td[2]
        // tr[i] => 1,2,3,4,5,6
        // td[j] => 1,2,3

        //create dynamic array by excluding variables

        String first_part = "//table[@id = 'customers']/tbody/tr[";
        //i
        String second_part ="]/td[";
        //j
        String third_part ="]";

        //find the number of rows
        int row = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr")).size();

        //find the number of columns
        int col = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr[2]/td")).size();

        for(int i = 2; i<=row; i++)
        {
            for(int j = 1; j<=col; j++)
            {
                String dyn_xpath = first_part+i+second_part+j+third_part;
                //System.out.println(dyn_xpath);
                String data = driver.findElement(By.xpath(dyn_xpath)).getText();
                //System.out.println(data);
                if(data.equalsIgnoreCase("Helen Bennett"))
                {
                    String country_text = driver.findElement(By.xpath(dyn_xpath + "/following-sibling::td")).getText();
                    System.out.println(country_text);

                    String company_text = driver.findElement(By.xpath(dyn_xpath+ "/preceding-sibling::td")).getText();
                    System.out.println(company_text);
                }
            }
        }
    }
}

package com.thetestingacademy.ex_15_Data_driven_testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSelenium36DDT01 {


//  parallel execution
    @DataProvider(name = "getData" , parallel = true)
    public Object[][] getData()
    {
        return new Object[][]{
                {"admin@gmail.com", "pass123"},
                {"admin1@gmail.com", "pass1234"},
                {"admin2@gmail.com", "pass22"}
        };
    }

    /** For Excel
     * Read data from excel
     * parse below as 2-D array
     */
//    @DataProvider
//    public Object[][] getData()
//    {
//       //read from excel and pass as 2d array
//    }

    @Test(dataProvider = "getData" )
    public void loginTest(String email, String password)
    {
        System.out.println(email + password);
    }

}

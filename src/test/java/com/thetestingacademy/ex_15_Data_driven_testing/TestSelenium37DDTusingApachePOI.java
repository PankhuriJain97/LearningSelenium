package com.thetestingacademy.ex_15_Data_driven_testing;

import org.testng.annotations.Test;

public class TestSelenium37DDTusingApachePOI {

    @Test(dataProvider = "getData", dataProviderClass = UtilExcel.class)
    public void login_vwo(String email, String password)
    {
        System.out.println(email + " | " + password + "|");
    }
}

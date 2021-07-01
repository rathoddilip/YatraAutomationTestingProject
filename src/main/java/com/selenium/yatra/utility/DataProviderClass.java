package com.selenium.yatra.utility;

import com.selenium.yatra.base.BaseClass;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.lang.reflect.Method;

public class DataProviderClass extends BaseClass {

    // @DataProvider passes data to test
    @DataProvider(name = "testDataSet")
    public Object[][] getData() {
        // Create object with two paraments
        // first parameter is row and second one is column
        Object[][] data = {{email, password}};
        return data;
    }
}

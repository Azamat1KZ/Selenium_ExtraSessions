package com.cydeo.tests.officeHours.day03;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class P01_HW1 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//        3- Verify “remember me” label text is as expected:


//        Expected: Remember me on this computer
//        4- Verify “forgot password” link text is as expected:
//        Expected: Forgot your password?
//        5- Verify “forgot password” href attribute’s value contains expected:
//        Expected: forgot_password=yes


    }

}

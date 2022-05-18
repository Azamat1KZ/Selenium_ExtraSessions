package com.cydeo.tests.officeHours.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_Name {
    public static void main(String[] args) throws InterruptedException {
//Setup browser
        WebDriverManager.chromedriver().setup();

        //Create instance
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

        driver.findElement(By.partialLinkText("Sign")).click();
        Thread.sleep(3000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Sign up";


        if (actualTitle.equals(expectedTitle)) {
            System.out.println("passed");
        } else {
            System.err.println("failed");
        }

        WebElement full_name = driver.findElement(By.name("full_name"));
        full_name.sendKeys("John Smith");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("john@cydeo.com");

        WebElement signup_button = driver.findElement(By.name("wooden_spoon"));
        signup_button.click();

        actualTitle = driver.getTitle();
        if (actualTitle.equals("Signup Confirmation")) {
            System.out.println("passed");
        } else {
            System.err.println("failed");
        }
        driver.quit();
    }

}

package com.seleniumjavatest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectors {
    static WebDriver driver;

    @Test
    public void chromeTest() {
        driver = new ChromeDriver();
        driver.get("http://www.automationpractice.pl/");
        driver.manage().window().maximize();

        WebElement link = driver.findElement(By.linkText("Sign in"));
        link.click();

        WebElement campoMail = driver.findElement(By.id("email"));
        campoMail.sendKeys("admin@localhost.asd");

        WebElement campoPass = driver.findElement(By.name("passwd"));
        campoPass.sendKeys("asd123");

        WebElement forgotYourPasswordLink = driver.findElement(By.partialLinkText("Forgot your"));
        System.out.println("Link: " + forgotYourPasswordLink.getText());

        WebElement btnLog = driver.findElement(By.id("SubmitLogin"));
        btnLog.click();


        driver.close();

    }
}

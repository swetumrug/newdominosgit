/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominosproject;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author swetu
 */
public class SigninPage2 {
 WebDriver driver;
    private JavascriptExecutor js;

    public SigninPage2(WebDriver driver) {
        this.driver = driver;
    }
    
    

     @FindBy(xpath = "//*[@id=\"__next\"]/header/div/nav/ul[2]/li[1]/button")
    private WebElement sIn;
     
     
    @FindBy(id = "Email")
    private WebElement userName;

    @FindBy(id="Password")
    private WebElement password;

    @FindBy(css = "#login-modal-form > div.css-h34j8g > button.css-670g51")
    private WebElement submitBtn;

    public void signinToFlighApplication()
           throws Exception {
        try {  
        driver.get("https://www.dominos.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    js = (JavascriptExecutor) driver;
    sIn.click();
            userName.sendKeys(FileUtil2.readForm().getUsername());
            password.sendKeys(FileUtil2.readForm().getPassword());
            submitBtn.click();
            //   LoginPage login = new LoginPage(driver);

        } catch (Exception ex) {
           ex.printStackTrace();
        }
}   
}

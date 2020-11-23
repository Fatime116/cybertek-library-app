package com.cybertek.library.pages;

import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="inputEmail")
    public WebElement EmailAddress;

    @FindBy(id="inputPassword")
    public WebElement Password;

    @FindBy(xpath="//button[.='Sign in']")
    public WebElement SignIn;

    @FindBy (xpath="//*[@ id=\"login-form\"]/div[2]/div")
    public WebElement ActualInvalidLoginMessage;
    //*[@id="login-form"]/div[2]/div
    // *[@id="login-form"]/div[2]/div

   public void logIn(){
       
       String lib59Username = ConfigurationReader.getProperty("lib59_username");
       String lib59Password = ConfigurationReader.getProperty("lib59_password");

       EmailAddress.sendKeys(lib59Username);
       Password.sendKeys(lib59Password);
       SignIn.click();
   }

    
    public void loginAttempt() throws InterruptedException {
       //valid username
       String student63username = ConfigurationReader.getProperty("stu63_username");
       //invalid password
       String student63password = ConfigurationReader.getProperty("stu63_password");
        EmailAddress.sendKeys(student63username);
        Password.sendKeys(student63password);
        SignIn.click();}
        
        public void invalidMessage (){
        //String AIM = ActualInvalidLoginMessage.getText();
        String ExpectedInvalidLoginMessage = "Sorry, Wrong Email or Password";
      // Assert.assertEquals( ExpectedInvalidLoginMessage, AIM, "doesn't match");
        System.out.println("Expected message: " + ExpectedInvalidLoginMessage);
        System.out.println("Actual message: " + ActualInvalidLoginMessage.getText()); 
        
    }








}

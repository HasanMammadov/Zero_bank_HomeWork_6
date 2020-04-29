package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy(css = "[id='signin_button']")
     WebElement signIn;

    @FindBy(css = "[id='user_login']")
    WebElement login;

    @FindBy(css = "[id='user_password']")
    WebElement password;

    @FindBy(css = "[name='submit']")
    WebElement submit;

    @FindBy(css = "[class='alert alert-error']")
    WebElement errorMessage;

    public String getErrorMessage(){
        return errorMessage.getText();
    }

    public void login(){

        signIn.click();
        login.sendKeys(ConfigurationReader.getProperty("username"));


        password.sendKeys(ConfigurationReader.getProperty("password"));

        submit.click();

    }


    public void login(String wrongUser, String wrongpassword){

        signIn.click();
        login.sendKeys(wrongUser);
        password.sendKeys(wrongUser);
        submit.click();
    }









}

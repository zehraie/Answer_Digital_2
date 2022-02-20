package com.answer.pages;

import com.answer.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormAutPage extends HomePage {

    @FindBy(id ="username")
    public WebElement userNameBox;

    @FindBy(id ="password")
    public WebElement passwordBox;

    @FindBy(xpath = "//i[@class='fa fa-2x fa-sign-in']")
    public WebElement login;


    @FindBy(css = ".flash.success")
    public WebElement getLogInMessage;

    @FindBy(css = ".flash.error")
    public WebElement getErrorMessage;

    @FindBy(xpath = "//i[contains(text(),'Logout')]")
    public WebElement logOut;

    @FindBy(xpath = "//h2[text()='Login Page']")
    public WebElement loginPageTitle;


    public void login (String userNameStr, String passwordStr){
        userNameBox.sendKeys(userNameStr);
        passwordBox.sendKeys(passwordStr);
        login.click();
    }




}

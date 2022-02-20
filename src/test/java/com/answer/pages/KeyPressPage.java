package com.answer.pages;

import com.answer.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyPressPage extends HomePage{

    @FindBy(id ="target")
    public WebElement keyInputBox;

    @FindBy(id ="result")
    public WebElement textElement;



}

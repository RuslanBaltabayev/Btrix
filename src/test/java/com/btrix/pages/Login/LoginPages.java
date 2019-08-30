package com.btrix.pages.Login;

import com.btrix.utilities.BasePage;
import com.btrix.utilities.BrowserUtility;
import com.btrix.utilities.ConfigurationReader;
import com.btrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages extends BasePage {

    public LoginPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "USER_LOGIN")
    public WebElement usernameLocator;
    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordLocator;
    @FindBy(name = "USER_REMEMBER")
    public WebElement remembermeLocator;
    @FindBy(className = "login-btn")
    public WebElement loginBttnLocator;

    public void login(String username,String password){
        BrowserUtility.waitPlease(1);
        usernameLocator.clear();
        BrowserUtility.waitPlease(1);
        usernameLocator.sendKeys(ConfigurationReader.getProperty(username));
        passwordLocator.sendKeys(ConfigurationReader.getProperty(password));
        remembermeLocator.click();
        loginBttnLocator.click();
    }
}

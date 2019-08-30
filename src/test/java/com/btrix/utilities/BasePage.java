package com.btrix.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    private static final Logger logger = LogManager.getLogger();

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    public WebElement userMenuName;

    @FindBy(xpath = "//*[@class='menu-popup-item-text'][contains(text(),'Log out')]")
    public  WebElement logout;


    public void navigateToModule(String module){
        String moduleLocator = "//span[@class='menu-item-link-text'][contains(text(),'"+module+"')]";
        WebElement moduleElement = Driver.getDriver().findElement(By.xpath(moduleLocator));
       BrowserUtility.waitForClickablility(moduleElement,2);
        moduleElement.click();
    }

    public void logout(){
        userMenuName.click();
        BrowserUtility.waitPlease(1);
        logout.click();
    }

    public String getPageTitle(){
        return Driver.getDriver().getTitle();
    }
}

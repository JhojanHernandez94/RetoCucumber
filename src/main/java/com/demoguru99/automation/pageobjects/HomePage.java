package com.demoguru99.automation.pageobjects;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://advantageonlineshopping.com/#/")
public class HomePage extends PageObject {

    By userButton = By.id("menuUser");
    public By createNewAcconuntOption = By.xpath("//a[@translate=\"CREATE_NEW_ACCOUNT\"]");

    public void clickuserButton(){
        getDriver().findElement(userButton).click();
    }
    public void clickCreateNewAcconuntOption(){
        getDriver().findElement(createNewAcconuntOption ).click();
    }
}

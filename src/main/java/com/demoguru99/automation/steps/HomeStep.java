package com.demoguru99.automation.steps;

import com.demoguru99.automation.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeStep {

    HomePage homePage = new HomePage();

    @Step
    public void openBrowaer(){
        homePage.open();
        //homePage.waitForCondition().until()
    }
    @Step
    public void createNewAcconunt(){
        homePage.clickuserButton();
        homePage.waitForCondition().until(ExpectedConditions.visibilityOfElementLocated(homePage.createNewAcconuntOption ));
        homePage.clickCreateNewAcconuntOption();
    }


}

package com.demoguru99.automation.steps;

import com.demoguru99.automation.models.Data;
import com.demoguru99.automation.pageobjects.CreateNewAccountPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateNewAccountStep {

    CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
    @Step
    public void createNewAccount(Data data){
        createNewAccountPage.setUserName(data.getUserName());
        createNewAccountPage.setEmail(data.getEmail());
        createNewAccountPage.setPassword(data.getPassword());
        createNewAccountPage.setConfirmPassword(data.getPassword());
        createNewAccountPage.clickCheckIAgree();
        createNewAccountPage.clickRegisterButton();
    }
    @Step
    public void messageAccountFailed(){
        createNewAccountPage.waitForCondition().until(ExpectedConditions.invisibilityOfElementLocated(createNewAccountPage.messageInvalidAccount));
    }
}

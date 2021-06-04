package com.demoguru99.automation.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CreateNewAccountPage extends PageObject {
    By userName = By.name("usernameRegisterPage");
    By email = By.name("emailRegisterPage");
    By password = By.name("passwordRegisterPage");
    By confirmPassword = By.name("confirm_passwordRegisterPage");
    By checkIAgrre = By.name("i_agree");
    By registerButton = By.id("register_btnundefined");
    public By messageInvalidAccount = By.xpath("//*[@id='registerPage']/article/sec-form/div[2]/label[1]");

    public void setUserName(String user)
    {
        getDriver().findElement(userName).sendKeys(user);
    }
    public void setEmail(String emailUser)
    {
        getDriver().findElement(email).sendKeys(emailUser);
    }
    public void setPassword(String passwordmailUser)
    {
        getDriver().findElement(password).sendKeys(passwordmailUser);
    }
    public void setConfirmPassword(String passwordmailUser)
    {
        getDriver().findElement(confirmPassword).sendKeys(passwordmailUser);
    }
    public void clickCheckIAgree()
    {
        getDriver().findElement(checkIAgrre).click();
    }
    public void clickRegisterButton()
    {
        getDriver().findElement(registerButton).click();
    }

}

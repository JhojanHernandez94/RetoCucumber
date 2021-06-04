package com.demoguru99.automation.steps;

import com.demoguru99.automation.models.Data;
import com.demoguru99.automation.pageobjects.HomeLoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.Assertions;

public class HomeLoginStep {

    HomeLoginPage homeLoginPage = new HomeLoginPage();
    @Step
    public void shouldUserNamePortal(Data data)
    {
        Assertions.assertEquals(data.getUserName(),
                homeLoginPage.userNamePortal());
    }
}

package com.demoguru99.automation.stepdefinitions;

import com.demoguru99.automation.models.Data;
import com.demoguru99.automation.steps.CreateNewAccountStep;
import com.demoguru99.automation.steps.HomeLoginStep;
import com.demoguru99.automation.steps.HomeStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegisterStepDefinition {
    @Steps
    HomeStep homeStep;
    @Steps
    CreateNewAccountStep createNewAccountStep;
    @Steps
    HomeLoginStep homeLoginStep;



    @Given("^enter the page to register$")
    public void enterThePageToRegister() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        homeStep.openBrowaer();
        Thread.sleep(4000);
        homeStep.createNewAcconunt();
    }

    @When("^direct the form$")
    public void directTheForm(List<Data> dataList) {
        // Write code here that turns the phrase above into concrete actions
        createNewAccountStep.createNewAccount(dataList.get(0));

    }

    @Then("^should see him username in the portal$")
    public void shouldSeeHimUsernameInThePortal(List<Data> dataList) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        createNewAccountStep.messageAccountFailed();
        Thread.sleep(4000);
        homeLoginStep.shouldUserNamePortal(dataList.get(0));

    }

}

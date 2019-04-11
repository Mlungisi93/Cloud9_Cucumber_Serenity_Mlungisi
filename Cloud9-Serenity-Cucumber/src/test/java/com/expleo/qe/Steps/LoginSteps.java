package com.expleo.qe.Steps;

import com.expleo.qe.pages.LoginPageObject;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
    LoginPageObject loginPage;

    @Step("Open the browser")
    public void openBrowser() throws InterruptedException {

        loginPage.openTheBrower();
    }

    @Step("Capture Email Address : {0} and password: {1} login details")
    public void LoginDetails(String email, String password) throws InterruptedException {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        Thread.sleep(5000);
        loginPage.clickSignInButton();
    }
@Step("{0}")
    public void confirmItineraryPage(String message) {


    }
}

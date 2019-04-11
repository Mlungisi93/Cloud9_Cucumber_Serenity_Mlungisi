package com.expleo.qe.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.util.concurrent.TimeUnit.SECONDS;

@DefaultUrl("http://performance-testing.co.za/Main/login.html")
public class LoginPageObject extends PageObject {
    private WebElement inputEmail;
    private WebElement inputPassword;
    private WebElement SigninButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/h1")
    private static WebElement itineraryHeader;

    public void openTheBrower() throws InterruptedException {
        open();
        getDriver().manage().timeouts().implicitlyWait(20, SECONDS);
        Thread.sleep(5000);
    }

    public void enterEmail(String email) {
        inputEmail.clear();
        inputEmail.sendKeys(email);
    }

    public void enterPassword(String password) {
        inputPassword.clear();
        inputPassword.sendKeys(password);
    }

    public void clickSignInButton() {
        SigninButton.click();
    }

    public static String assertItineraryPage() {
        String message = " ";
        try
        {
            Assert.assertEquals("I am not on the Itinerary page", "Itinerary", itineraryHeader.getText());
            message = " I am on the Itinerary";
        }catch (AssertionError e) {
            message = e.getMessage();
        }
        return message;
    }
}

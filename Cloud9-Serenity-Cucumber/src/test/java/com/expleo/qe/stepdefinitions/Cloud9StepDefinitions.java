package com.expleo.qe.stepdefinitions;

import com.expleo.qe.Steps.BookFlightSteps;
import com.expleo.qe.Steps.LoginSteps;
import com.expleo.qe.Steps.NavigationSteps;
import com.expleo.qe.pages.BookFlightPageObject;
import com.expleo.qe.pages.LoginPageObject;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

public class Cloud9StepDefinitions {
    @Steps
    LoginSteps loginsteps;

    @Steps
    NavigationSteps navigationSteps;

    @Steps
    BookFlightSteps bookFlightSteps;

    @Given("^That I am on the Clould(\\d+) home page$")
    public void that_I_am_on_the_Clould_home_page(int arg1) throws InterruptedException {
        loginsteps.openBrowser();
    }

    @When("^Log in with valid user id  and password$")
    public void log_in_with_valid_user_id_and_password() throws InterruptedException {
        loginsteps.LoginDetails("mlungisi.khumalo93@expleogroup.com", "mlungisi");
    }

    @Then("^I will be take to the itenarary page$")
    public void i_will_be_take_to_the_itenarary_page() throws InterruptedException {
        loginsteps.confirmItineraryPage(LoginPageObject.assertItineraryPage());
        navigationSteps.clickLogOut();
        Thread.sleep(5000);
    }

    @Given("^I navigate to the booking page$")
    public void i_navigate_to_the_booking_page() {
        navigationSteps.clickBookFlight();
        bookFlightSteps.confirmPage(BookFlightPageObject.assertBookFlightPage());

    }

    @When("^I add a valid booking$")
    public void i_add_a_valid_booking() {
     bookFlightSteps.bookFlight("Johannesburg", "Durban", "A23","Business");
    }

    @Then("^My booking is successful$")
    public void my_booking_is_successful() {
     bookFlightSteps.confirmPage(BookFlightPageObject.assertBookFlightSuccesFulPage());
    }

}

package com.expleo.qe.Steps;

import com.expleo.qe.pages.BookFlightPageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class BookFlightSteps {
    BookFlightPageObject bookFlightPageObject;

    @Step("{0}")
    public void confirmPage(String message) {


    }

    @Step("Booked the flight origin: {0} destistination: {1} seat No: {2} class: {3}")
    public void bookFlight(String origin, String destination, String seat, String classType) {

    bookFlightPageObject.selectOrigin(origin);//
    bookFlightPageObject.selectDestination(destination);//
    bookFlightPageObject.enterSeat(seat);//
    bookFlightPageObject.selectClass(classType);//
    bookFlightPageObject.clickBookButton();

    }
}

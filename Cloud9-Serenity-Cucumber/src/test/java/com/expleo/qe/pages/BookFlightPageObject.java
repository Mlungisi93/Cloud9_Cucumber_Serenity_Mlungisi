package com.expleo.qe.pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BookFlightPageObject extends PageObject {

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/h1")
    private static WebElement bookFlightHeader;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/h2/center")
    private static WebElement addBookingSuccessfulpageHeader;

    //@FindBy(how = How.NAME, using = "Origin")
    private WebElement Origin;
    public void selectOrigin(String listElement)
    {
        Select selctOrigin = new Select(Origin);
        selctOrigin.selectByVisibleText(listElement);
    }

    //@FindBy(how = How.NAME, using = "Destination")
    private WebElement Destination;
    public void selectDestination(String listElement)
    {
        Select selctDestination = new Select(Destination);
        selctDestination.selectByVisibleText(listElement);
    }

    private WebElement seat;
    public void enterSeat(String seatNumber) {
        seat.sendKeys(seatNumber);
    }
    private WebElement Flightclass;
    public void selectClass(String listElement)
    {
        Select selctFlightclass = new Select(Flightclass);
        selctFlightclass.selectByVisibleText(listElement);
    }


    private WebElement submitbutton;
    public void clickBookButton()
    {
        submitbutton.click();
    }


    public static String assertBookFlightPage() {
        String message = " ";
        try
        {
            Assert.assertEquals("I am not on the Book Flight page", "Book Flight", bookFlightHeader.getText());
            message = " I am on the Book Flight Page";
        }catch (AssertionError e)
        {
            message = e.getMessage();
        }
        return message;
    }

    public static String assertBookFlightSuccesFulPage() {
        String message = " ";
        try
        {
            Assert.assertEquals("I am not successful in booking flight", "Flight booked successfully", addBookingSuccessfulpageHeader.getText());
            message = " I am successful in booking flight";
        }catch (AssertionError e)
        {
            message = e.getMessage();
        }
        return message;
    }
}

package com.expleo.qe.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NavigationPageObject extends PageObject {
    @FindBy(how = How.LINK_TEXT, using = "Logout")
    private WebElement logoutLink;

    @FindBy(how = How.LINK_TEXT, using = "Book Flight")
    private WebElement bookFlightLink;

    public void clickLogout()
    {
       logoutLink.click();
    }

    public void clickBookFlight() {
        bookFlightLink.click();
    }
}

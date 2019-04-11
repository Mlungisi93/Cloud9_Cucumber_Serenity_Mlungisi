package com.expleo.qe.Steps;

import com.expleo.qe.pages.NavigationPageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class NavigationSteps {
    NavigationPageObject navigationPageObject;



    @Step("Now we logout")
    public void clickLogOut() {
        navigationPageObject.clickLogout();
    }

    @Step("Clicked Book Flight Link")
    public void clickBookFlight() {
        navigationPageObject.clickBookFlight();
    }
}

package tests;

import Steps.LandingPageSteps;
import configuration.BasePage;
import org.testng.annotations.Test;

public class SearchTests extends BasePage {

    LandingPageSteps landingPage;

    @Test
    public void loginAndAssertLandingPage() {
        landingPage = new LandingPageSteps(getDriver());

        landingPage.getDollarBuyPrice();
        landingPage.getDollarSellPrice();
    }

}

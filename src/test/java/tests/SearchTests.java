package tests;

import Steps.LandingPageSteps;
import configuration.BasePage;
import org.testng.annotations.Test;

public class SearchTests extends BasePage {

    LandingPageSteps landingPage;

    @Test
    public void getDollarPrices() {
        landingPage = new LandingPageSteps(getDriver());

        landingPage.waitForPageToLoad();
        landingPage.getDollarBuyPrice();
        landingPage.getDollarSellPrice();
    }

}

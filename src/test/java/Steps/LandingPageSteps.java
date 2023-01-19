package Steps;

import org.openqa.selenium.WebDriver;
import pages.LandingPage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LandingPageSteps extends LandingPage {

    LandingPage landingPage = new LandingPage(getDriver());
    Logger logger = Logger.getLogger(LandingPageSteps.class.getName());

    public LandingPageSteps(WebDriver driver) {
        super(driver);
    }

    public void waitForPageToLoad(){
        waitForElement(landingPage.homeLogo);
    }

    public void getDollarBuyPrice(){
        logger.log(Level.FINE, "Dollar buy price is: " + dollarBuyPrice.getText());
        System.out.println("Dollar buy price is: " + dollarBuyPrice.getText());
    }

    public void getDollarSellPrice(){
        logger.log(Level.FINE, "Dollar sell price is: " + dollarSellPrice.getText());
        System.out.println("Dollar sell price is: " + dollarSellPrice.getText());
    }
}

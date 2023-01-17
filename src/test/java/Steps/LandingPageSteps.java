package Steps;

import org.openqa.selenium.WebDriver;
import pages.LandingPage;

public class LandingPageSteps extends LandingPage {

    LandingPage landingPage = new LandingPage(getDriver());

    public LandingPageSteps(WebDriver driver) {
        super(driver);
    }

    public void waitForPageToLoad(){
        waitForElement(landingPage.homeLogo);
    }

    public void getDollarBuyPrice(){
        System.out.println("Dollar buy price is: " + dollarBuyPrice.getText());
    }

    public void getDollarSellPrice(){
        System.out.println("Dollar sell price is: " + dollarSellPrice.getText());
    }
}

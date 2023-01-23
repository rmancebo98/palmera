package Steps;

import com.relevantcodes.extentreports.LogStatus;
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
        test.log(LogStatus.PASS, "Page loaded");
    }

    public void getDollarBuyPrice(){
        System.out.println("Dollar buy price is: " + dollarBuyPrice.getText());
        test.log(LogStatus.PASS, "Dollar buy price collected");
    }

    public void getDollarSellPrice(){
        System.out.println("Dollar sell price is: " + dollarSellPrice.getText());
        test.log(LogStatus.PASS, "Dollar sell price collected");
    }
}

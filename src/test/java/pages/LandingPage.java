package pages;

import configuration.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage {

    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "img[class='logo-bc-header img img-responsive']")
    public WebElement homeLogo;


    @FindBy(css = "span#actualPurchaseValue")
    public WebElement dollarBuyPrice;


    @FindBy(css = "span#actualSellingValue")
    public WebElement dollarSellPrice;

}

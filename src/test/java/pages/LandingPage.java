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

    @FindBy(css = "div > a.site-logo-a")
    public WebElement homeLogo;


    @FindBy(xpath = "//div[@class='site-header-panel container-fullsize-colored-dark']//span[contains(text(),'Compra')]")
    public WebElement dollarBuyPrice;


    @FindBy(xpath = "//div[@class='site-header-panel container-fullsize-colored-dark']//span[contains(text(),'Venta')]")
    public WebElement dollarSellPrice;

}

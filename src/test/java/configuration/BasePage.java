package configuration;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver;
    protected static ExtentTest test;
    protected static ExtentReports report;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        report = new ExtentReports(
                "src/test/java/results/ExtentReportResults.html");

        driver.get("https://www.bancentral.gov.do/SectorExterno/HistoricoTasas");
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
        report.endTest(test);
        report.flush();
    }

    public void waitForElement(WebElement ele) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(ele));
    }
}

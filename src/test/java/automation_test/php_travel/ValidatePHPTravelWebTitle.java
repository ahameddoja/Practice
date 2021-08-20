package automation_test.php_travel;

import automation_test.mortgage_calculator.CalculateMonthlyPayment;
import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ReadConfigFiles;

public class ValidatePHPTravelWebTitle {
    private static final Logger LOGGER = LogManager.getLogger(ValidatePHPTravelWebTitle.class);
    WebDriver driver;

    @BeforeMethod
    public void browserInitialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LOGGER.info("--------------Start Test (ValidatePHPTravelWebTitle)------------------");
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("PHPTravelUrl"));
    }

    @Test
    public void verifyHomePageTitle() {

        String expectedTitle = "Demo Script Test drive - PHPTRAVELS";
        String actualTitle = ActOn.browser(driver).captureTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @AfterMethod
    public void closeBrowser() {
        ActOn.browser(driver).closeBrowser();
        LOGGER.info("Browser is closed");
        LOGGER.info("==End Test(ValidatePHPTravelWebTitle)==");
    }
}
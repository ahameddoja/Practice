package automation_test.mortgage_calculator;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.LoggerForParallelTests;
import listeners.RetryFailedTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_Objects.Home;
import utilities.DateUtils;
import utilities.ReadConfigFiles;

public class CalculateMonthlyPayment extends LoggerForParallelTests {

    private static final Logger LOGGER = LogManager.getLogger(CalculateMonthlyPayment.class);
    WebDriver driver;

    @BeforeMethod
    public void browserInitialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LOGGER.info("--------------Start Test (CalculateMonthlyPayment)------------------");
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("MortgageCalculatorUrl"));
        LOGGER.info("Browser is successfully initiated");
    }

    @Test(retryAnalyzer = RetryFailedTest.class)
    public void calculateMonthlyPayment() {
        String Date = DateUtils.returnNextMonth();
        String[] dateArray = Date.split("-");
//        String month = dateArray[0];
        String year = dateArray[1];
        new Home(driver)
               .typeHomePrice("300000")
               .typeDownPayment("60000")
               .clickDownPaymentInDollar()
               .typeLoanAmount("240000")
               .typeInterestRate("3")
               .typeLoanTermInYears("30")
//               .selectMonth(month)
               .typeYear(year)
               .typePropertyTax("5000")
               .typePMI("0.5")
               .typeHOI("1000")
               .typeHOA("100")
               .selectLoanType("FHA")
               .selectBuyOrRefi("Buy")
               .clickOnCalculateButton()
               .validateMonthlyPayment("$1,611.85");
    }

    @AfterMethod
    public void testCleanup () {
       ActOn.browser(driver).closeBrowser();
       LOGGER.info("Browser is closed");
        LOGGER.info("==End Test (CalculateMonthlyPayment)==");
    }

}
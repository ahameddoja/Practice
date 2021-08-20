package automation_test.mortgage_calculator_parameterized;

import automation_test.mortgage_calculator.CalculateMonthlyPayment;
import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
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
import utilities.SqlConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CalculateMonthlyPaymentParameterized {
    private static final Logger LOGGER = LogManager.getLogger(CalculateMonthlyPaymentParameterized.class);
    WebDriver driver;

    @BeforeMethod
    public void browserInitialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LOGGER.info("--------------Start Test (CalculateMonthlyPayment)------------------");
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("MortgageCalculatorUrl"));
        LOGGER.info("Browser is successfully initiated");
    }

    @Test
    public void calculateMonthlyPayment() {
        String Date = DateUtils.returnNextMonth();
        String[] dateArray = Date.split("-");
//      String month = dateArray[0];
        String year = dateArray[1];
        ResultSet rs = SqlConnector.readData("Select * from monthly_mortgage");
        try {
            while (rs.next()) {
                LOGGER.info("------Start of new " + rs.getRow() + " Iteration---------");
                new Home(driver)
                        .typeHomePrice(rs.getString("homevalue"))
                        .typeDownPayment(rs.getString("downpayment"))
                        .clickDownPaymentInDollar()
                        .typeLoanAmount(rs.getString("loanamount"))
                        .typeInterestRate(rs.getString("interestrate"))
                        .typeLoanTermInYears(rs.getString("loanterm"))
//                        .selectMonth(month)
                        .typeYear(year)
                        .typePropertyTax(rs.getString("propertytax"))
                        .typePMI(rs.getString("pmi"))
                        .typeHOI(rs.getString("homeownerinsurance"))
                        .typeHOA(rs.getString("monthlyhoa"))
                        .selectLoanType(rs.getString("loantype"))
                        .selectBuyOrRefi(rs.getString("buyorrefi"))
                        .clickOnCalculateButton()
                        .validateMonthlyPayment(rs.getString("totalmonthlypayment"));
            }

        } catch (SQLException e) {
            LOGGER.error("SQL Query error: " + e.getMessage());
        }
    }

        @AfterMethod
        public void testCleanup () {
            ActOn.browser(driver).closeBrowser();
            LOGGER.info("Browser is closed");
            LOGGER.info("==End Test (CalculateMonthlyPayment)==");
        }
    }
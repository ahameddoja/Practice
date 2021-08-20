package automation_test.mortgage_calculator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//public class CalculateMonthlyPayment1 {
//    private final By HomeValue = By.id("homeval");
//    private final By DownPayment = By.id("downpayment");
//    private final By DownPaymentInDollar = By.xpath("//*[@id='calc']//input[@name='param[downpayment_type]'][@value='money']");
//    private final By LoanAmount = By.id("loanamt");
//    private final By InterestRate = By.id("intrstsrate");
//    private final By LoneTerm = By.id("loanterm");
//    private final By SelectDateMonth = By.name("param[start_month]");
//    private final By SelectDateYear = By.id("start_year");
//    private final By PropertyTax = By.id("pptytax");
//    private final By PMI = By.id("pmi");
//    private final By HomeInsurance = By.id("hoi");
//    private final By Hoa = By.id("hoa");
//    private final By FHA = By.name("param[milserve]");
//    private final By BuyOrRafi = By.name("param[refiorbuy]");
//    private final By Calculate = By.name("cal");
//
//    WebDriver driver;
//    Select select;
//
//    @BeforeMethod
//    public void openBrowser() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://www.mortgagecalculator.org/");
//        driver.manage().window().maximize();
//    }
//    public void enterMortgageData() {
//      //Enter Home value "300000"
//      driver.findElement(HomeValue).clear();
//      driver.findElement(HomeValue).sendKeys("300000");
//
//      //Enter Down Payment "60000"
//      WebDriverWait wait = new WebDriverWait(driver,5);
//      wait.until(ExpectedConditions.visibilityOfElementLocated(DownPayment));
//      driver.findElement(DownPayment).clear();
//      driver.findElement(DownPayment).sendKeys("60000");
//
//      //Click on the $ Radio Button for Downpayment option
//      driver.findElement(DownPaymentInDollar).click();
//
//      //Enter Loan Amount "240000"
//      driver.findElement(LoanAmount).clear();
//      driver.findElement(LoanAmount).sendKeys("240000");
//
//      //Enter Interest Rate 3.0%
//      driver.findElement(InterestRate).clear();
//      driver.findElement(InterestRate).sendKeys("3");
//
//      //Loan Term in years "30"
//       driver.findElement(LoneTerm).clear();
//       driver.findElement(LoneTerm).sendKeys("30");
//
//      //Select the month "Nov"
//        select = new Select(driver.findElement(SelectDateMonth));
//        select.selectByVisibleText("Nov");
//
//      // Enter the year "2021"
//        driver.findElement(SelectDateYear).clear();
//        driver.findElement(SelectDateYear).sendKeys("2021");
//
//      //Enter Property Tax "5000"
//        driver.findElement(PropertyTax).clear();
//        driver.findElement(PropertyTax).sendKeys("5000");
//
//      //PMI is "0.5%"
//        driver.findElement(PMI).clear();
//        driver.findElement(PMI).sendKeys("0.5");
//
//      //Enter Home Insurance "1000"
//        driver.findElement(HomeInsurance);
//        driver.findElement(HomeInsurance).sendKeys("1000");
//
//      //Enter Monthly HOA "100"
//        driver.findElement(Hoa).clear();
//        driver.findElement(Hoa).sendKeys("100");
//
//      //Select Loan Type "FHA"
//        select = new Select(driver.findElement(FHA));
//        select.selectByVisibleText("FHA");
//
//      //Select "Buy" from Buy or Rafi dropdown
//        select = new Select(driver.findElement(BuyOrRafi));
//        select.selectByVisibleText("Buy");
//    }
//
//    @Test
//    public void calculateMonthlyPayment() {
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        enterMortgageData();
//
//    //Click on the calculate button
//        driver.findElement(Calculate).click();
//
//    //Total Monthly Payment "$1,611.85.
//        String total_monthly_payment = "$1611.85";
//        boolean monthlyPaymentExist = driver.findElements(By.xpath("//*[@id='calc']//h3[text()='$1,611.85']")).size() > 0;
//        Assert.assertTrue(monthlyPaymentExist, "Total Monthly Payment is wrong");
//    }
//
//    @AfterMethod
//    public void closingBrowser() {
//        driver.quit();
//    }
//
//}

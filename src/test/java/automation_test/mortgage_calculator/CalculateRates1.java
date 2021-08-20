package automation_test.mortgage_calculator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//public class CalculateRates1 {
//    private final By RateLink = By.linkText("Rates");
//    private final By RealAprLink = By.linkText("Real APR");
//    private final By CalculatorTab = By.xpath("//label[normalize-space()='Calculator']");
//    private final By HomeValue = By.name("HomeValue");
//    private final By DownPayment = By.name("DownPayment");
//    private final By DownPaymentInDollar = By.id("DownPaymentSel0");
//    private final By InterestRate = By.name("Interest");
//    private final By CalculateButton = By.name("calculate");
//    private  final By ActualAPRValue = By.xpath("//*[@id='analysisDiv']/table/tbody/tr/td/strong[contains(text(),'Actual APR')]/../../td[2]/strong");
//
//    WebDriver driver;
//
//    @BeforeMethod
//    public void browserInitialization() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://www.mortgagecalculator.org/");
//        driver.manage().window().maximize();
//    }
//
//    public void navigateToRealAPIPage() {
//        //Mouse Hover to the rate link
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(RateLink)).perform();
//
//        //Click on Real Apr Link
//        driver.findElement(RealAprLink).click();
//
//    }
//    public void enterRealAprData() {
//        driver.findElement(HomeValue).clear();
//        driver.findElement(HomeValue).sendKeys("200000");
//
//        driver.findElement(DownPaymentInDollar).click();
//
//        driver.findElement(DownPayment).clear();
//        driver.findElement(DownPayment).sendKeys("15000");
//
//        driver.findElement(InterestRate).click();
//        driver.findElement(InterestRate).sendKeys("3");
//
//    }
//
//    @Test
//    public void calculateRealApr() {
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//        //Navigate to Real Apr Page
//        navigateToRealAPIPage();
//
//        //Wait for the calculator tab to exist
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(CalculatorTab));
//
//        //Enter data to calculate real apr
//        enterRealAprData();
//
//        //Click on calculate button
//        driver.findElement(CalculateButton).click();
//
//        //Validate the APR
//        String aprRate = driver.findElement(ActualAPRValue).getText();
//        Assert.assertEquals(aprRate,"3.130%");
//
//    }
//
//    @AfterMethod
//    public void closeBrowser() {
//        driver.quit();
//    }
//}



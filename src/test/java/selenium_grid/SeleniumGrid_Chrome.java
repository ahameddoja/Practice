package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import utilities.TestEnvironment;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid_Chrome {
    WebDriver driver;

//    @Test
//    public void executeInAwsDocker() {
//        ChromeOptions chromeOptions = new ChromeOptions();
//        try{
//            gridUrl = new URL("http://18.118.241.238:4444/wd/hub");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        driver = new RemoteWebDriver(gridUrl, chromeOptions);
//        driver.get("https://www.mortgagecalculator.org/");
//        System.out.println(driver.getTitle());
//        driver.quit();
//
//    }
    @Test
    public void executeInAwsDocker() throws MalformedURLException {
        driver = TestEnvironment.selectTestExecutionEnvironment();
        driver.get("https://www.mortgagecalculator.org/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}

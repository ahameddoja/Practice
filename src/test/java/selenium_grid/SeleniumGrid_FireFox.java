package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import utilities.TestEnvironment;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid_FireFox {
    WebDriver driver;
//    URL gridUrl;
//
//    @Test
//    public void executeInAwsDocker() {
//        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        try{
//            gridUrl = new URL("http://18.118.241.238:4444/wd/hub");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        driver = new RemoteWebDriver(gridUrl, firefoxOptions);
//        driver.get("https://qateksolutions.com/");
//        System.out.println(driver.getTitle());
//        driver.quit();
//
//    }
    @Test
    public void executeInAwsDocker() throws MalformedURLException {
        driver = TestEnvironment.selectTestExecutionEnvironment();
        driver.get("https://qateksolutions.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}

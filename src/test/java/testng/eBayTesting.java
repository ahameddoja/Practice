package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class eBayTesting {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
}
    @Test
    public void searchProduct() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("gh-ac")).clear();
        driver.findElement(By.id("gh-ac")).sendKeys("iPhone");
        driver.findElement((By.id("gh-btn"))).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Daily Deals")).click();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

}

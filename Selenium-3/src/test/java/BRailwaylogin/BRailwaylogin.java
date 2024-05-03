package BRailwaylogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BRailwaylogin {
	public static void main(String[] args) throws InterruptedException {
        // Setup Firefox WebDriver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();
        
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
     // Maximize the browser window
        
        
        // Now you can use 'driver' to interact with the Firefox browser
        // For example, navigate to a URL
        driver.get("https://eticket.railway.gov.bd/login");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("mobile_number")).sendKeys("01866210026");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("tasnim@w1");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.login-form-control-single:nth-child(3)")).click();
        Thread.sleep(2000);
      
        // Close the browser
        driver.quit();
    }
}

package testng;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FirstRun {
	
	Webdriver driver;

	@BeforeClass
    public void setUp() {
        // Set up WebDriver
       // System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @Test(priority = 1)
    public void launchgmail() {
        
        driver.get("https://www.gmail.com/");
        String pageTitle = driver.getTitle();
        //Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
    }
    
    @Test(priority = 2)
    public void loginWithValidCredentials() {
       
        WebElement emailField = driver.findElement(By.id("gmail.com"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.name("login"));
        
        emailField.sendKeys("rajinikanthcfst2015@gmail.com");
        passwordField.sendKeys("Rk@418#$&");
        loginButton.click();
        
        // Verify login success
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://www.gmail.com/");
    }
  
    
    @AfterClass
    public void tearDown() {
  	// Close the browser
        driver.quit();

}
}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gb_H")).click();
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
}

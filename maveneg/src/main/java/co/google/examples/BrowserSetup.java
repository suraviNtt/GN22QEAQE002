package co.google.examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {

	
	public static void main(String[] args) {
		
		//locating chrome
		WebDriverManager.chromedriver().setup();
		// defining chrome driver
		WebDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//lauch url
		driver.get("https://phptravels.com/demo/");
		//find by id and click
		driver.findElement(By.id("icon")).click();
	WebElement elementName =	driver.findElement(By.xpath(""));
	elementName.click();
	List<WebElement> elementsNmae = driver.findElements(By.xpath("//a"));
	
		//closing brower window instance
//		driver.close();
		
	}
}

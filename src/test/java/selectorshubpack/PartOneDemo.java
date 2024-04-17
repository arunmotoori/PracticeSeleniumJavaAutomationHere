package selectorshubpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartOneDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("arun@gmail.com");
		
		WebElement passwordField = driver.findElement(By.id("pass"));
		passwordField.sendKeys("12345");
		
		WebElement companyNameField = driver.findElement(By.name("company"));
		companyNameField.sendKeys("QAFox");
		
		WebElement mobileNumberField = driver.findElement(By.name("mobile number"));
		mobileNumberField.sendKeys("9123456789");
		
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		submitButton.click();
		
		
		
	}

}

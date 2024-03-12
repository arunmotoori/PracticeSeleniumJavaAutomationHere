package demoqapack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubmitDetailsIntoTextBoxFields {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		WebElement fullNameField = driver.findElement(By.id("userName"));
		fullNameField.sendKeys("Arun Motoori");
		
		WebElement emailField = driver.findElement(By.id("userEmail"));
		emailField.sendKeys("arun@gmail.com");
		
		WebElement currentAddressField = driver.findElement(By.id("currentAddress"));
		currentAddressField.sendKeys("Flat No 101,\\nAakash Colony,\\nVidyanagar\\nHyderabad,\\n500067");
		
		WebElement permanentAddressField = driver.findElement(By.id("permanentAddress"));
		permanentAddressField.sendKeys("Flat No 101,\\nAakash Colony,\\nVidyanagar\\nHyderabad,\\n500067");
	
		WebElement submitButton = driver.findElement(By.id("submit"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",submitButton);
		
		submitButton.click();
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement nameText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		WebElement emailText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		WebElement currentAddressText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='currentAddress'][@class='mb-1']")));
		WebElement permanentAddressText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='permanentAddress'][@class='mb-1']")));
		
		System.out.println(nameText.getText());
		System.out.println(emailText.getText());
		System.out.println(currentAddressText.getText());
		System.out.println(permanentAddressText.getText());
		
		driver.quit();
	
	}

}

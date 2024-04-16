package letcodepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowDomDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/shadow");
		
		WebElement shadowHost1 = driver.findElement(By.id("open-shadow"));
		SearchContext sc1 = shadowHost1.getShadowRoot();
		WebElement firstName = sc1.findElement(By.cssSelector("#fname"));
		firstName.sendKeys("Arun");
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).sendKeys("Motoori")
		.sendKeys(Keys.TAB).sendKeys("arun.gmail.com")
		.build().perform();
		
		/*
		WebElement shadowHost2 = driver.findElement(By.xpath("//my-web-component"));
		SearchContext sc2 = shadowHost2.getShadowRoot();
		WebElement lastName = sc2.findElement(By.cssSelector("#lname"));
		lastName.sendKeys("Motoori");
		
		WebElement shadowHost3 = driver.findElement(By.id("close-shadow"));
		SearchContext sc3 = shadowHost3.getShadowRoot();
		WebElement emailField = sc3.findElement(By.cssSelector("#email"));
		emailField.sendKeys("arun@gmail.com");
		*/

	}

}

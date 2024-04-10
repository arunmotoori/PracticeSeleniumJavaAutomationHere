package letcodepractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsDemo {
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/elements");
	}
	
	@AfterMethod
	public void closure() {
		
		driver.quit();
		
	}

	@Test
	public void verifyElementsTestOne() {
		
		WebElement userNameField = driver.findElement(By.name("username"));
		userNameField.sendKeys("arunmotoori");
		
		WebElement searchButton = driver.findElement(By.id("search"));
		searchButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement gitImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//figure/img")));
		
		Assert.assertTrue(gitImage.isDisplayed());
		
		String expectedName = "Arun Motoori";
		String actualName = driver.findElement(By.xpath("//p[@class='title is-4']")).getText();

		Assert.assertEquals(actualName, expectedName);
		
		String expectedLocation = "Hyderabad";
		String actualLocation = driver.findElement(By.xpath("//p[@class='subtitle is-6']")).getText();
		
		Assert.assertEquals(actualLocation, expectedLocation);
		
		String expectedAbout = "Founder at www.qafox.com";
		String actualAbout = driver.findElement(By.xpath("//div[@class='media-content']/span")).getText();
		
		Assert.assertEquals(actualAbout, expectedAbout);
		
		String publicReposNumberShown = driver.findElement(By.xpath("(//span[@class='tag is-info'])[1]")).getText();
		
		List<WebElement> displayedRepoLinks = driver.findElements(By.xpath("//app-gitrepos//a"));
		
		for(WebElement repoLink : displayedRepoLinks) {
			
			System.out.println(repoLink.getAttribute("href"));
			
		}
	
		int displayedRepoLinksNumber = displayedRepoLinks.size();
		
		int publicReposNumber = Integer.parseInt(publicReposNumberShown);
		
		Assert.assertEquals(displayedRepoLinksNumber, publicReposNumber);
		

	}

}

package letcodepractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAletsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/waits");
		
		WebElement simpleAlertButton = driver.findElement(By.id("accept"));
		simpleAlertButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		String textOnAlert = alert.getText();
		System.out.println(textOnAlert);
		alert.accept();
		
		driver.switchTo().defaultContent();
		
		WebElement pageHeading = driver.findElement(By.xpath("//h1"));
		String pageHeadingText = pageHeading.getText();
		System.out.println(pageHeadingText);
		
		driver.quit();
		
	}

}

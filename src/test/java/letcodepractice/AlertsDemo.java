package letcodepractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		
		driver.findElement(By.id("accept")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("confirm")).click();
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		alert = driver.switchTo().alert();
		String textOnConfirmationAlert = alert.getText();
		System.out.println(textOnConfirmationAlert);
		Thread.sleep(2000);
		alert.dismiss();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("prompt")).click();
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
		alert.sendKeys("Arun");
		Thread.sleep(2000);
		alert.accept();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("modern")).click();
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement lightBoxElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='title']")));
		String textOnLightBox = lightBoxElement.getText();
		System.out.println(textOnLightBox);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='close']")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}

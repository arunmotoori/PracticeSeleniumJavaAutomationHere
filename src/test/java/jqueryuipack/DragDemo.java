package jqueryuipack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/draggable/");
		
		WebElement frameOne = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frameOne);
		
		WebElement box = driver.findElement(By.id("draggable"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDropBy(box,150,190).build().perform();
	}

}

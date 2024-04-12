package jqueryuipack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frameOne = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameOne);
		
		WebElement dragBox = driver.findElement(By.id("draggable"));
		WebElement dropBox = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(dragBox, dropBox).build().perform();

	}

}

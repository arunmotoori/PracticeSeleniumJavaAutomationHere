package letcodepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/draggable");
		
		WebElement box = driver.findElement(By.id("sample-box"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(box,50,90).perform();

	}

}

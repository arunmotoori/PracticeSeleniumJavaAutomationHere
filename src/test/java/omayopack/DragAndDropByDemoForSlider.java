package omayopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByDemoForSlider {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page3.html");
		
		WebElement minPrice = driver.findElement(By.xpath("//a[@*='price-min-label']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(minPrice,100,0).perform();
		
		WebElement maxPrice = driver.findElement(By.xpath("//a[@*='price-max-label']"));
		
		actions.dragAndDropBy(maxPrice,50,0).perform();

	}

}

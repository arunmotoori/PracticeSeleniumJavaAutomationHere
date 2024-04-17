package selectorshubpack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartOneContinuedDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String commentText = (String)jse.executeScript("return document.querySelector(\"[data-id='dfae242']>div\").childNodes[3].textContent");
		System.out.println(commentText);

		driver.quit();
		
		/*
		WebElement parentElement = driver.findElement(By.xpath("(//div[@class='elementor-widget-container']/span)[1]/parent::div"));
		List<WebElement> elementsUnderParentElement = parentElement.findElements(By.xpath("./*"));
		
		for(WebElement element : elementsUnderParentElement) {
			
		
			if(element.getTagName().equals("#comment")) {
				
				String commentText = element.getAttribute("textContent");
				System.out.println(commentText);
				break;
				
			}
			
		}*/
		
		
	}

}

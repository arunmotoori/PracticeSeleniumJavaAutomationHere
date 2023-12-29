package letcodepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsDemo {

	public static void main(String[] args)  {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement fruitsDropdownField = driver.findElement(By.id("fruits"));
		Select select = new Select(fruitsDropdownField);
		select.selectByVisibleText("Apple");
		boolean fruitsState = select.isMultiple();
		System.out.println(fruitsState); //false
		
		WebElement superHerosField = driver.findElement(By.id("superheros"));
		select = new Select(superHerosField);
		
		if(select.isMultiple()) {
			
			select.selectByVisibleText("Ant-Man");
			select.selectByVisibleText("The Avengers");
			
		}
		
		WebElement languagesField = driver.findElement(By.id("lang"));
		select = new Select(languagesField);
		List<WebElement> options = select.getOptions();
		int noOfOptions = options.size();
		int lastOptionIndex = noOfOptions-1;
		select.selectByIndex(lastOptionIndex);
		
		for(WebElement option : options) {
			
			System.out.println(option.getText());
			
		}
		
		WebElement countriesField = driver.findElement(By.id("country"));
		select = new Select(countriesField);
		select.selectByValue("India");
		System.out.println(select.getFirstSelectedOption().getText());
	
		
		driver.quit();
		

	}

}

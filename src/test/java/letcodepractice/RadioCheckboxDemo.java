package letcodepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckboxDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		
		driver.findElement(By.id("yes")).click();
		
		WebElement yesRadioButton = driver.findElement(By.id("one"));
		WebElement noRadioButton = driver.findElement(By.id("two"));
		yesRadioButton.click();
		boolean yesStatus = yesRadioButton.isSelected();
		boolean noStatus = noRadioButton.isSelected();
		
		if(yesStatus) {
			
			if(noStatus) {
				
				System.out.println("Failed");
				
			}
			
		}
		
		noRadioButton.click();
		yesStatus = yesRadioButton.isSelected();
		noStatus = noRadioButton.isSelected();
		
		if(noStatus) {
			
			if(yesStatus) {
				
				System.out.println("Failed");
				
			}
			
		}
		
		WebElement yButton = driver.findElement(By.id("nobug"));
		WebElement nButton = driver.findElement(By.id("bug"));
		yButton.click();
		nButton.click();
		
		if(yButton.isSelected() && nButton.isSelected()) {
			
			System.out.println("Bug Found.");
			
		}
		
		WebElement fooButton = driver.findElement(By.id("foo"));
		WebElement barButton = driver.findElement(By.id("notfoo"));
		
		if(fooButton.isSelected()) {
			
			System.out.println("foo is in selected state");
			
		}else if(barButton.isSelected()) {
			
			System.out.println("bar is in selected state");
			
		}
		
		WebElement mayBeRadioButton = driver.findElement(By.id("maybe"));
		
		if(mayBeRadioButton.isEnabled()) {
			
			System.out.println("mayBeRadioButton is in enabled state");
			
		}else {
			
			System.out.println("mayBeRadioButton is in disabled state");
			
		}
		
		WebElement checkBox = driver.findElement(By.xpath("//label[contains(text(),'Remember me')]/input"));
		
		if(checkBox.isSelected()) {
			
			System.out.println("Checkbox is in selected state");
			
		}else {
			
			System.out.println("Checkbox is not in selected state");
			
		}
		
		driver.findElement(By.xpath("//label[contains(text(),'I agree to the')]/input")).click();
		
		
		driver.quit();

	}

}

package letcodepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		
		driver.findElement(By.id("fullName")).sendKeys("Arun Motoori");
		
		driver.findElement(By.id("join")).sendKeys(" teacher.");
		driver.findElement(By.id("join")).sendKeys(Keys.TAB);
		
		String retrievedText = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(retrievedText);
		
		driver.findElement(By.id("clearMe")).clear();
		
		boolean enabledStatus = driver.findElement(By.id("noEdit")).isEnabled();
		
		if(enabledStatus) {
			System.out.println("Edit Field is in enabled state");
		}else {
			System.out.println("Edit Field is in disabled state");
		}
		
		String readOnlyStatus = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		if(readOnlyStatus.equals("true")) {
			System.out.println("Confirm Text field is in readonly state");
		}else {
			System.out.println("Confirm Text field is not in readonly state");
		}
		
		

	}

}

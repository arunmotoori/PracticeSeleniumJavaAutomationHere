package letcodepractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsDemo {

	@Test
	public void handlingWindowsTestOne() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/windows");
		
		String parentWindowId = driver.getWindowHandle();
		
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		String childWindowId = null;
		
		for(String windowId : windowIds) {
			
			if(!windowId.equals(parentWindowId)) {
				childWindowId = windowId;
			}
			
		}
		
		driver.switchTo().window(childWindowId);
		
		String childWindowTitle = driver.getTitle();
		System.out.println(childWindowTitle);
		
		driver.switchTo().window(parentWindowId);
		
		driver.close();
		
		driver.switchTo().window(childWindowId);
		
		driver.close();
		
	}
	
    @Test
	public void handlingWindowsTestTwo() {
		
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://letcode.in/windows");
    	
    	WebElement multipleWindowsButton = driver.findElement(By.id("multi"));
    	multipleWindowsButton.click();
    	
    	List<String> list = new ArrayList<>();
    	
    	list.addAll(driver.getWindowHandles());
    	
    	/*
    	for(int i=0;i<list.size();i++) {
    		
    		driver.switchTo().window(list.get(i));
    		System.out.println(driver.getTitle());
    		
    	}*/
    	
    	for(String windowId : list) {
    		
    		driver.switchTo().window(windowId);
    		System.out.println(driver.getTitle());
    		
    	}
    	
    	
    	
    	/*
    	Iterator<String> itr = windowIds.iterator();
    	
    	while(itr.hasNext()) {
    		
    		driver.switchTo().window(itr.next());
    		System.out.println(driver.getTitle());
    		
    	}*/
    	
    	/*
    	for(String windowId : windowIds) {
    		
    		driver.switchTo().window(windowId);
    		
    		System.out.println(driver.getTitle());
    		
    	}*/
    	
    	driver.quit();
    

	}

}

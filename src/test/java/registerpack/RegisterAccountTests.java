package registerpack;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterAccountTests {

	@Test
	public void registerAccountWithMandatoryFields() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		
		WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		
		WebElement firstNameField = driver.findElement(By.id("input-firstname"));
		firstNameField.sendKeys("Arun");
		
		WebElement lastNameField = driver.findElement(By.id("input-lastname"));
		lastNameField.sendKeys("Motoori");
		
		Date date = new Date();
		WebElement emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys(date.toString().replace(" ","_").replace(":","_")+"@gmail.com");
		
		WebElement telephoneField = driver.findElement(By.id("input-telephone"));
		telephoneField.sendKeys("1234567890");
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("12345");
		
		WebElement passwordConfirmField = driver.findElement(By.id("input-confirm"));
		passwordConfirmField.sendKeys("12345");
		
		WebElement privacyPolicyField = driver.findElement(By.name("agree"));
		privacyPolicyField.click();
		
		WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
		continueButton.click();
		
		myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		
		WebElement logoutOption = driver.findElement(By.linkText("Logout"));
		
		Assert.assertTrue(logoutOption.isDisplayed());
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
		Assert.assertEquals(actualURL,expectedURL);
		String expectedHeading = "Your Account Has Been Created!";
		WebElement headingElement = driver.findElement(By.xpath("//div[@id='content']/h1"));
		String actualHeading = headingElement.getText();
		Assert.assertEquals(actualHeading, expectedHeading);
		WebElement actualCongradulationsElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p"));
		String actualCongradulationsText = actualCongradulationsElement.getText();
		String expectedCongradulationsText = "Congratulations! Your new account has been successfully created!";
		Assert.assertEquals(actualCongradulationsText,expectedCongradulationsText);
		WebElement actualmemberPrivilegesElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p[2]"));
		String actualmemberPrivilegesText = actualmemberPrivilegesElement.getText();
		String expectedmemberPrivilegesText = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		Assert.assertTrue(actualmemberPrivilegesText.contains(expectedmemberPrivilegesText));
		WebElement actualmemberQuestionsElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p[3]"));
		String actualQuestionsText = actualmemberQuestionsElement.getText();
		String expectedQuestionsText = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		Assert.assertTrue(actualQuestionsText.contains(expectedQuestionsText));
		WebElement actualConfirmationEmailElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p[4]"));
		String actualConfirmationEmailText = actualConfirmationEmailElement.getText();
		String expectedConfirmationEmailText = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please";
		Assert.assertTrue(actualConfirmationEmailText.contains(expectedConfirmationEmailText));
		WebElement contactUsLinkElement = driver.findElement(By.linkText("contact us"));
		Assert.assertTrue(contactUsLinkElement.isDisplayed());
		
		WebElement continueButtonElement = driver.findElement(By.xpath("//a[text()='Continue']"));
		continueButtonElement.click();
		
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "My Account";
		Assert.assertEquals(actualPageTitle,expectedPageTitle);
	
		driver.quit();
		
	}

	@Test
	public void registerAccountWithAllFields() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		
		WebElement firstNameField = driver.findElement(By.id("input-firstname"));
		firstNameField.sendKeys("Arun");
		
		WebElement lastNameField = driver.findElement(By.id("input-lastname"));
		lastNameField.sendKeys("Motoori");
		
		Date date = new Date();
		WebElement emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys(date.toString().replace(" ","_").replace(":","_")+"@gmail.com");
		
		WebElement telephoneField = driver.findElement(By.id("input-telephone"));
		telephoneField.sendKeys("1234567890");
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("12345");
		
		WebElement passwordConfirmField = driver.findElement(By.id("input-confirm"));
		passwordConfirmField.sendKeys("12345");
		
		WebElement yesFieldElement = driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']"));
		yesFieldElement.click();
		
		WebElement privacyPolicyField = driver.findElement(By.name("agree"));
		privacyPolicyField.click();
		
		WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
		continueButton.click();
		
		myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		
		WebElement logoutOption = driver.findElement(By.linkText("Logout"));
		
		Assert.assertTrue(logoutOption.isDisplayed());
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
		Assert.assertEquals(actualURL,expectedURL);
		String expectedHeading = "Your Account Has Been Created!";
		WebElement headingElement = driver.findElement(By.xpath("//div[@id='content']/h1"));
		String actualHeading = headingElement.getText();
		Assert.assertEquals(actualHeading, expectedHeading);
		WebElement actualCongradulationsElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p"));
		String actualCongradulationsText = actualCongradulationsElement.getText();
		String expectedCongradulationsText = "Congratulations! Your new account has been successfully created!";
		Assert.assertEquals(actualCongradulationsText,expectedCongradulationsText);
		WebElement actualmemberPrivilegesElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p[2]"));
		String actualmemberPrivilegesText = actualmemberPrivilegesElement.getText();
		String expectedmemberPrivilegesText = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		Assert.assertTrue(actualmemberPrivilegesText.contains(expectedmemberPrivilegesText));
		WebElement actualmemberQuestionsElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p[3]"));
		String actualQuestionsText = actualmemberQuestionsElement.getText();
		String expectedQuestionsText = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		Assert.assertTrue(actualQuestionsText.contains(expectedQuestionsText));
		WebElement actualConfirmationEmailElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p[4]"));
		String actualConfirmationEmailText = actualConfirmationEmailElement.getText();
		String expectedConfirmationEmailText = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please";
		Assert.assertTrue(actualConfirmationEmailText.contains(expectedConfirmationEmailText));
		WebElement contactUsLinkElement = driver.findElement(By.linkText("contact us"));
		Assert.assertTrue(contactUsLinkElement.isDisplayed());
		
		WebElement continueButtonElement = driver.findElement(By.xpath("//a[text()='Continue']"));
		continueButtonElement.click();
		
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "My Account";
		Assert.assertEquals(actualPageTitle,expectedPageTitle);
	
		driver.quit();
		
	}
	
	@Test
	public void registerWithoutProvidingAnyFields() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		
		WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
		continueButton.click();
		
		String actualFirstNameWarningMessage = driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).getText();
		String expectedFirstNameWarningMessage = "First Name must be between 1 and 32 characters!";
		Assert.assertEquals(actualFirstNameWarningMessage, expectedFirstNameWarningMessage);
	
		String actualLastNameWarningMessage = driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div")).getText();
		String expectedLastNameWarningMessage = "Last Name must be between 1 and 32 characters!";
		Assert.assertEquals(actualLastNameWarningMessage, expectedLastNameWarningMessage);
		
		String actualEmailWarningMessage = driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div")).getText();
		String expectedEmailWarningMessage = "E-Mail Address does not appear to be valid!";
		Assert.assertEquals(actualEmailWarningMessage, expectedEmailWarningMessage);
		
		String actualTelephoneWarningMessage = driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText();
		String expectedTelephoneWarningMessage = "Telephone must be between 3 and 32 characters!";
		Assert.assertEquals(actualTelephoneWarningMessage, expectedTelephoneWarningMessage);
		
		String actualPasswordWarningMessage = driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).getText();
		String expectedPasswordWarningMessage = "Password must be between 4 and 20 characters!";
		Assert.assertEquals(actualPasswordWarningMessage, expectedPasswordWarningMessage);
	
		String actualPrivacyPolicyMessage = driver.findElement(By.xpath("//div[@id='account-register']/div[1]")).getText();
		String expectedPrivacyPolicyMessage = "Warning: You must agree to the Privacy Policy!";
		Assert.assertTrue(actualPrivacyPolicyMessage.contains(expectedPrivacyPolicyMessage));
	
		driver.quit();
	}
	
	@Test
	public void registerAccountBySelectingYesNewsletterOption()  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		
		WebElement firstNameField = driver.findElement(By.id("input-firstname"));
		firstNameField.sendKeys("Arun");
		
		WebElement lastNameField = driver.findElement(By.id("input-lastname"));
		lastNameField.sendKeys("Motoori");
		
		Date date = new Date();
		WebElement emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys(date.toString().replace(" ","_").replace(":","_")+"@gmail.com");
		
		WebElement telephoneField = driver.findElement(By.id("input-telephone"));
		telephoneField.sendKeys("1234567890");
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("12345");
		
		WebElement passwordConfirmField = driver.findElement(By.id("input-confirm"));
		passwordConfirmField.sendKeys("12345");
		
		WebElement yesFieldElement = driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']"));
		yesFieldElement.click();
		
		WebElement privacyPolicyField = driver.findElement(By.name("agree"));
		privacyPolicyField.click();
		
		WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
		continueButton.click();
		
		myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		WebElement logoutOption = driver.findElement(By.linkText("Logout"));
		Assert.assertTrue(logoutOption.isDisplayed());
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
		Assert.assertEquals(actualURL,expectedURL);
		
		String expectedHeading = "Your Account Has Been Created!";
		WebElement headingElement = driver.findElement(By.xpath("//div[@id='content']/h1"));
		String actualHeading = headingElement.getText();
		Assert.assertEquals(actualHeading, expectedHeading);
		WebElement actualCongradulationsElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p"));
		String actualCongradulationsText = actualCongradulationsElement.getText();
		String expectedCongradulationsText = "Congratulations! Your new account has been successfully created!";
		Assert.assertEquals(actualCongradulationsText,expectedCongradulationsText);
		WebElement actualmemberPrivilegesElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p[2]"));
		String actualmemberPrivilegesText = actualmemberPrivilegesElement.getText();
		String expectedmemberPrivilegesText = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		Assert.assertTrue(actualmemberPrivilegesText.contains(expectedmemberPrivilegesText));
		WebElement actualmemberQuestionsElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p[3]"));
		String actualQuestionsText = actualmemberQuestionsElement.getText();
		String expectedQuestionsText = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		Assert.assertTrue(actualQuestionsText.contains(expectedQuestionsText));
		WebElement actualConfirmationEmailElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p[4]"));
		String actualConfirmationEmailText = actualConfirmationEmailElement.getText();
		String expectedConfirmationEmailText = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please";
		Assert.assertTrue(actualConfirmationEmailText.contains(expectedConfirmationEmailText));
		WebElement contactUsLinkElement = driver.findElement(By.linkText("contact us"));
		Assert.assertTrue(contactUsLinkElement.isDisplayed());
		
		WebElement continueButtonElement = driver.findElement(By.xpath("//a[text()='Continue']"));
		continueButtonElement.click();
		
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "My Account";
		Assert.assertEquals(actualPageTitle,expectedPageTitle);
		
		WebElement subscribeUnsubscribeNewsletterOption = driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter"));
		subscribeUnsubscribeNewsletterOption.click();
		boolean yesRadioButtonState = driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).isSelected();
		Assert.assertTrue(yesRadioButtonState);
		
		driver.quit();
	
	}
	
	@Test
	public void registerAccountBySelectingNoNewsletterOption()  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		
		WebElement registerOption = driver.findElement(By.linkText("Register"));
		registerOption.click();
		
		WebElement firstNameField = driver.findElement(By.id("input-firstname"));
		firstNameField.sendKeys("Arun");
		
		WebElement lastNameField = driver.findElement(By.id("input-lastname"));
		lastNameField.sendKeys("Motoori");
		
		Date date = new Date();
		WebElement emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys(date.toString().replace(" ","_").replace(":","_")+"@gmail.com");
		
		WebElement telephoneField = driver.findElement(By.id("input-telephone"));
		telephoneField.sendKeys("1234567890");
		
		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("12345");
		
		WebElement passwordConfirmField = driver.findElement(By.id("input-confirm"));
		passwordConfirmField.sendKeys("12345");
		
		WebElement noRadioFieldElement = driver.findElement(By.xpath("//input[@name='newsletter'][@value='0']"));
		noRadioFieldElement.click();
		
		WebElement privacyPolicyField = driver.findElement(By.name("agree"));
		privacyPolicyField.click();
		
		WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
		continueButton.click();
		
		myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		WebElement logoutOption = driver.findElement(By.linkText("Logout"));
		Assert.assertTrue(logoutOption.isDisplayed());
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/success";
		Assert.assertEquals(actualURL,expectedURL);
		
		String expectedHeading = "Your Account Has Been Created!";
		WebElement headingElement = driver.findElement(By.xpath("//div[@id='content']/h1"));
		String actualHeading = headingElement.getText();
		Assert.assertEquals(actualHeading, expectedHeading);
		WebElement actualCongradulationsElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p"));
		String actualCongradulationsText = actualCongradulationsElement.getText();
		String expectedCongradulationsText = "Congratulations! Your new account has been successfully created!";
		Assert.assertEquals(actualCongradulationsText,expectedCongradulationsText);
		WebElement actualmemberPrivilegesElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p[2]"));
		String actualmemberPrivilegesText = actualmemberPrivilegesElement.getText();
		String expectedmemberPrivilegesText = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		Assert.assertTrue(actualmemberPrivilegesText.contains(expectedmemberPrivilegesText));
		WebElement actualmemberQuestionsElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p[3]"));
		String actualQuestionsText = actualmemberQuestionsElement.getText();
		String expectedQuestionsText = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		Assert.assertTrue(actualQuestionsText.contains(expectedQuestionsText));
		WebElement actualConfirmationEmailElement = driver.findElement(By.xpath("//div[@id='content']/h1/following-sibling::p[4]"));
		String actualConfirmationEmailText = actualConfirmationEmailElement.getText();
		String expectedConfirmationEmailText = "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please";
		Assert.assertTrue(actualConfirmationEmailText.contains(expectedConfirmationEmailText));
		WebElement contactUsLinkElement = driver.findElement(By.linkText("contact us"));
		Assert.assertTrue(contactUsLinkElement.isDisplayed());
		
		WebElement continueButtonElement = driver.findElement(By.xpath("//a[text()='Continue']"));
		continueButtonElement.click();
		
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "My Account";
		Assert.assertEquals(actualPageTitle,expectedPageTitle);
		
		WebElement subscribeUnsubscribeNewsletterOption = driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter"));
		subscribeUnsubscribeNewsletterOption.click();
		boolean noRadioButtonState = driver.findElement(By.xpath("//input[@name='newsletter'][@value='0']")).isSelected();
		Assert.assertTrue(noRadioButtonState);
		
		driver.quit();
		
	}

	
}

package com.learnautomation.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="//a[contains(text(),'Log')]") WebElement loginButton;
	@FindBy(name="email") WebElement emailadd;
	@FindBy(name="password") WebElement pass;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']") WebElement submitButton;
	
	public void loginToCRM(String username, String password) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		loginButton.click();		 
		emailadd.sendKeys(username);
		pass.sendKeys(password);
		submitButton.click();		
	}
}

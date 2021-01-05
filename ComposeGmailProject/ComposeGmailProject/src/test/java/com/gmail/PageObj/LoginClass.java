package com.gmail.PageObj;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginClass {

	WebDriver ldriver;
	
	public LoginClass(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="identifier")
	@CacheLookup
	WebElement userid;
	
	@FindBy(className="VfPpkd-RLmnJb")
	@CacheLookup
	WebElement next;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	
	@FindBy(xpath="VfPpkd-RLmnJb")
	@CacheLookup
	WebElement nextlogin;
	
	
	
	public void setUserName(String uname)
	{
		userid.sendKeys(uname);
	}
	
	public void setNext()
	{
		next.click();
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		nextlogin.click();}
}
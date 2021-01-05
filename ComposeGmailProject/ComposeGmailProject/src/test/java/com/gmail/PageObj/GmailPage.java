package com.gmail.PageObj;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GmailPage {

WebDriver ldriver;
	
	public GmailPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public static Logger logger;
	
	@FindBy(how = How.CLASS_NAME, using ="T-I T-I-KE L3")
	@CacheLookup
	WebElement composebuttton;

	@FindBy(how = How.NAME, using = "to")
	@CacheLookup
	WebElement to_Email;

	@FindBy(how = How.CLASS_NAME, using = "l m")
	@CacheLookup
	WebElement newMessage;

	@CacheLookup
	@FindBy(how = How.NAME, using = "subjectbox")
	WebElement subField;

	@CacheLookup
	@FindBy(how = How.NAME, using = "cc")
	WebElement ccText;

	@CacheLookup
	@FindBy(how = How.NAME, using = "gO aQY")
	WebElement bccText;

	@CacheLookup
	@FindBy(how = How.ID, using = "6q")
	WebElement sendButton;

	@CacheLookup
	@FindBy(how = How.NAME, using = "og T-I-J3")
	WebElement deleteButton;

	@CacheLookup
	@FindBy(how = How.CLASS_NAME, using = "TN bzz aHS-bnq")
	WebElement draftButton;

	@CacheLookup
	@FindBy(how = How.ID, using = ":cq")
	WebElement attachement;

	@CacheLookup
	@FindBy(how = How.CLASS_NAME, using = "TC")
	WebElement getname;

	@CacheLookup
	@FindBy(how = How.CLASS_NAME, using = "BltHke nH oy8Mbf")
	WebElement draftverify;
	
	@CacheLookup
	@FindBy(how = How.ID, using = ":ab")
	WebElement emailbody;
	
	public boolean emailbody(String para) {
		emailbody.sendKeys(para);;
		return true;
			
	}
	
	public boolean to_Email(String email) {
		to_Email.sendKeys(email);;
		return true;
			
	}

	public void composebuttton() {
		composebuttton.click();
		
	}

	public boolean newMessage() {
		 newMessage.isDisplayed();
		 return true;
	}

	public boolean subField(String subject) {
		subField.sendKeys(subject);
		return true;
		
	}

	public void ccText(String email) {
		ccText.sendKeys(email);
	}

	public void bccText(String email) {
		bccText.sendKeys(email);
	}

	public void sendButton() {
		sendButton.click();
	}

	public void deleteButton() {
		deleteButton.click();
	}

	public boolean draftButton() {
		draftButton.click();
		return true;
	}

	public void attachment() {
		attachement.isDisplayed();
	}

	public String getname() {
		return getname.getText();
	}

	public void draftverify() {
		draftverify.isDisplayed();
	}
	
	
}

package com.gmail.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.gmail.PageObj.GmailPage;

public class MaxSizeAttachementErrorScenarios extends GmailPage {

	public MaxSizeAttachementErrorScenarios(WebDriver rdriver) {
		super(rdriver);
		
		GmailPage gmail = new GmailPage(rdriver);
		String myerror =  "Large files must be shared with Google Drive Attachments larger than 25MB will be automatically uploaded to Google Drive. A download link will be included in your emails.";
		String error= gmail.getname();
		if(error == myerror)
		{
			Assert.assertTrue(true);
			logger.info("test pass");
		}
	else
	{
		Assert.assertTrue(false);
		logger.info(" test failed");
	}
		
	}

}

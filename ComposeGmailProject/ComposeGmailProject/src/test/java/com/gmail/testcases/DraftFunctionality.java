package com.gmail.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.gmail.PageObj.GmailPage;

public class DraftFunctionality extends GmailPage {

	public DraftFunctionality(WebDriver rdriver) {
		super(rdriver);
		GmailPage gmail = new GmailPage(rdriver);
		if (gmail.draftButton()==true)
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

package com.gmail.testcases;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.gmail.PageObj.GmailPage;

public class ComposeFrameDisplay extends GmailPage {

	public ComposeFrameDisplay(WebDriver rdriver) {
		super(rdriver);
		
		GmailPage gmail = new GmailPage(rdriver);
		
		gmail.composebuttton();
		if(gmail.newMessage()==true)
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
 
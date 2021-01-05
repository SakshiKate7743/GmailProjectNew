package com.gmail.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.gmail.PageObj.GmailPage;

public class TextEnterdSuccessfully extends GmailPage{

	public TextEnterdSuccessfully(WebDriver rdriver) {
		super(rdriver);
		GmailPage gmail = new GmailPage(rdriver);
		
		//text entered in email body
		String para = "dsfsdgfgdfhrhrtherhjtrherhtretherhtrehrthrehrwhreh";
		if(gmail.emailbody(para)==true)
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

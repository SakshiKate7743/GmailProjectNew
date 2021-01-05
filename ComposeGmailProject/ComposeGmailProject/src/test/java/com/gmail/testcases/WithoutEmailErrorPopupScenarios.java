package com.gmail.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.gmail.PageObj.GmailPage;
import com.gmail.utilities.ReadConfig;

public class WithoutEmailErrorPopupScenarios extends GmailPage{

	public WithoutEmailErrorPopupScenarios(WebDriver rdriver) {
		super(rdriver);
		ReadConfig readconfig=new ReadConfig();
		GmailPage gmail = new GmailPage(rdriver);
		String email = readconfig.getemailID();
		String subject = readconfig.getSubject();
		String para = "dsfsdgfgdfhrhrtherhjtrherhtretherhtrehrthrehrwhreh";
		gmail.composebuttton();
		gmail.bccText(email);
		gmail.to_Email(email);
		gmail.subField(subject);
		gmail.emailbody(para);
		gmail.attachment();
		gmail.sendButton();
		if(gmail.newMessage()==false)
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

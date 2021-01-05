package com.gmail.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.gmail.PageObj.GmailPage;
import com.gmail.utilities.ReadConfig;

public class SubjectEmailBodyText  extends GmailPage{

	public SubjectEmailBodyText(WebDriver rdriver) {
		super(rdriver);
		ReadConfig readconfig=new ReadConfig();
		GmailPage gmail = new GmailPage(rdriver);
		String subject = readconfig.getSubject();
		
		if(gmail.subField(subject)==true)
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

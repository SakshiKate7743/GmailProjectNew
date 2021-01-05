package com.gmail.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.gmail.PageObj.GmailPage;
import com.gmail.utilities.ReadConfig;

public class MultipleEmailID extends GmailPage {

	public MultipleEmailID(WebDriver rdriver) {
		super(rdriver);
		ReadConfig readconfig=new ReadConfig();
		GmailPage gmail = new GmailPage(rdriver);
		
		String email = readconfig.getemailID();
		gmail.to_Email(email);
		//n number of times we can add email id
		if(gmail.to_Email(email)==true)
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

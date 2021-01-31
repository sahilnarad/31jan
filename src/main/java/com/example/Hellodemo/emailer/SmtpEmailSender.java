

package com.example.Hellodemo.emailer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("smtpBean")
@Qualifier("smtp")
public class SmtpEmailSender implements IEmailerService
{
	private static Log Log=LogFactory.getLog(SmtpEmailSender.class);
	
	//@Override
	public void sendEmail(String emailID, String subject, String mailContent)
	{
		//To-Do auto generated method sub
		Log.info("SMTP Mail Receiver ID : "+emailID);
		Log.info("SMTP Mail Subject : "+subject);
		Log.info("SMTP Mail Body : "+mailContent);
		Log.warn("THIS IS JUST SMTP EMAIL SENDER");
		
	}

}

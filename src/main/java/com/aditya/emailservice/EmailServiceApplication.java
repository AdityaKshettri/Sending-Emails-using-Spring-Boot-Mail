package com.aditya.emailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aditya.emailservice.model.Mail;
import com.aditya.emailservice.service.MailService;

@SpringBootApplication
public class EmailServiceApplication implements CommandLineRunner
{
	@Autowired
	private MailService mailService;
	
	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		Mail mail = new Mail();
		mail.setMailFrom("sender@gmail.com");
		mail.setMailTo("receiver@gmail.com");
		mail.setMailSubject("Spring Boot - Email demo");
		mail.setMailContent("Just testing");
		mailService.sendEmail(mail);
	}

}

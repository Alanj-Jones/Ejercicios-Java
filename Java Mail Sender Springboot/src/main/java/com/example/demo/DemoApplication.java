package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DemoApplication {


	@Autowired
	private SendEmailService sendEmailService;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void trigger(){
		sendEmailService.sendEmail("alanjavierjones@gmail.com", "Tu paciente se encuentra en estado de emergencia, comunicarse pronto!", "EMERGENCIA!");
	}

}

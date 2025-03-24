package com.chatApp.chatApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class ChatAppApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(ChatAppApplication.class, args);
	}

}

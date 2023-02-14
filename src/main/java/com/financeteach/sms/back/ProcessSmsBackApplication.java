package com.financeteach.sms.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ProcessSmsBackApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProcessSmsBackApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ProcessSmsBackApplication.class, args);
	}

}

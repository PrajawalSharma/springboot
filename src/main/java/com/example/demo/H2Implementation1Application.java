package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class H2Implementation1Application {

	public static void main(String[] args) {
		SpringApplication.run(H2Implementation1Application.class, args);
	}
	
	@Bean
	 public WebMvcConfigurer configure() {
	  return new WebMvcConfigurer() {
	   @Override
	   public void addCorsMappings(CorsRegistry reg) {
	    reg.addMapping("/**").allowedOrigins("http://localhost:3000/");
		System.out.println("This is first commit");
		System.out.println("This is second commit");
		System.out.println("This is third commit");
		System.out.println("This is second commit");
		System.out.println("This is third commit");
		System.out.println("This is second commit");
		System.out.println("This is third commit");
		System.out.println("This is third commit");
		System.out.println("This is second commit");
		System.out.println("This is third commit");
		System.out.println("This is second commit");
		System.out.println("This is third commit");
		System.out.println("This is third commit");
		System.out.println("This is third commit");
		System.out.println("This is third commit");
		System.out.println("This is fifth commit");
		System.out.println("This is sixth commit");
		System.out.println("This is seventh commit");
		System.out.println("This is eigth commit");

	   }
	  };
	  
	}

}

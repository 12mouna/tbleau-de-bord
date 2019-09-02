package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class webController  implements WebMvcConfigurer{
	
	
		 
		
	@Override
		public void addViewControllers(ViewControllerRegistry registry) {
			registry.addViewController("/").setViewName("dashboard");
			registry.addViewController("/dashboard").setViewName("dashboard");
			registry.addViewController("/dashboard").setViewName("Newuser");


		}



		
	}

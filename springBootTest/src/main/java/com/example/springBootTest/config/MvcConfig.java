package com.example.springBootTest.config;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfig implements WebMvcConfigurer{
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		WebMvcConfigurer.super.addViewControllers(registry);
		
		registry.addRedirectViewController("/home/home", "/home/home");
		registry.addRedirectViewController("/member/list", "/member/member_list");
	}

}

package com.glearning.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Config {
	@Bean
	public Docket libraryApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Library-API").select()
				.apis(RequestHandlerSelectors.basePackage("com.glearning.springdemo.controller")).build();
	}

//http://localhost:8080/swagger-ui.html  --- url to hit swagger documentation

	//not working
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Library Api").description("Library Api reference for developers")
				.termsOfServiceUrl("http://fakeLibrary.com")
				.contact(new Contact("Library Api", "http://fakeLibrary.com", "xyz@yahoo.com"))
				.license("Library license").licenseUrl("http://fakeLibrary.com").version("1.0.0").build();
	}
}

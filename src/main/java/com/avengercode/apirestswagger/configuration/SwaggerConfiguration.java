/**
 * 
 */
package com.avengercode.apirestswagger.configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author abraao
 * @size 2019-08-19 AvengersCode
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.avengercode.apirestswagger.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
	    return new ApiInfo(
	      "Exemplo REST API", 
	      "Some custom description of API.", 
	      "API Exemple", 
	      "Terms of service", 
	      new Contact("Abraão Pinto", "www.avengercode.com", "cto@avengercode.com"), 
	      "License of API", "API license URL", Collections.emptyList());
	}
}

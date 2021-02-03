package com.bloodbank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.PathSelectors
//import springfox.documentation.builders.PathSelectors.r
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	
	
	@Bean
	public Docket docket() {
		 return new Docket(DocumentationType.SWAGGER_2)
	                .groupName("public-api")
				 	.select()
	                .apis(RequestHandlerSelectors.basePackage("com.bloodbank"))
	                .paths(PathSelectors.any())
	                .build().apiInfo(apiInfo());
	}
	


	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Blood Bank Management System API")
				.description("This API can be used to get profile level information")
				.contact(new Contact("Nishchith Kulkarni", "", "kulkarninishchith@gmail.com"))
				.license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.version("0.0.1-SNAPSHOT")
				.build();
	}

}

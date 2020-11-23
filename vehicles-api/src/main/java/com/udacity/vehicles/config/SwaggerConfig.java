package com.udacity.vehicles.config;

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

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Vehicles API",
                "A REST API to maintain vehicle data and to provide a complete view of vehicle"
                        + " details including price and address",
                "1.0",
                "www.udacity.com",
                new Contact("Rodrigo Silva", "www.udacity.com", "rodrigosilvap93@gmail.com"),
                "www.udacity.com",
                "www.udacity.com",
                Collections.emptyList()
        );
    }    
}

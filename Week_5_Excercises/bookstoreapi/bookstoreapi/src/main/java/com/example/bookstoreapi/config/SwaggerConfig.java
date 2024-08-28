package com.example.bookstoreapi.config;

import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("bookstore-api")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public Info apiInfo() {
        return new Info().title("Bookstore API")
                .description("API documentation for the Bookstore application")
                .version("1.0");
    }
}

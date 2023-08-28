package com.portfolio.CozyConnection.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringDocConfig {

// Configures Swagger documentation API
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build();
//    }

    @Bean
    public GroupedOpenApi api(){
        return GroupedOpenApi.builder()
                .group("users")
                .pathsToMatch("/api/**")
                .build();
    }
}
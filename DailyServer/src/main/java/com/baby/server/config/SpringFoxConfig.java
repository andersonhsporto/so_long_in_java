package com.baby.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {
    @Bean
    public Docket dockets() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "API RESTFUL",
                "A simple Restful API to validate a string which contains an equation.",
                "1.0",
                "https://github.com/42sp/42labs-dontpanic_baby-27546999",
                new Contact("Pleiades", "https://github.com/orgs/42sp/teams/pleiades", "gusalves@student.42sp.org.br"),
                "NGINX LICENSE VERSION 1.18.0 UBUNTU",
                "https://github.com/nginx/nginx/blob/e6b3a11581a8040baf7aded3319b0dec433b2461/docs/text/LICENSE",
                new ArrayList<VendorExtension>()
        );
        return apiInfo;
    }
}
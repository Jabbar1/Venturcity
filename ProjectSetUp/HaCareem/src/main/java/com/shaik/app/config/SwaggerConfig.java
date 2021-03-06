//package com.shaik.app.config;
//
//import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
//import com.mangofactory.swagger.plugin.EnableSwagger;
//import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
//import com.wordnik.swagger.model.ApiInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Created by jabbars on 2/22/2017.
// */
//@Configuration
//@EnableSwagger
//public class SwaggerConfig {
//    private SpringSwaggerConfig springSwaggerConfig;
//    @Autowired
//    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
//        this.springSwaggerConfig = springSwaggerConfig;
//    }
//    @Bean
//    public SwaggerSpringMvcPlugin customImplementation() {
//        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).apiInfo(
//                apiInfo()).includePatterns("/v1/.*");
//    }
//    private ApiInfo apiInfo() {
//        ApiInfo apiInfo = new ApiInfo("SaurzCode API", "API for Saurzcode",
//                "Saurzcode API terms of service", "mail2saurzcode@gmail.com",
//                "Saurzcode API Licence Type", "Saurzcode API License URL");
//        return apiInfo;
//    }
//}
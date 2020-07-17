package com.imooc.springbootproj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    //配置了 Swagger的Docket的bean属性
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("文杰")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.imooc.springbootproj.controller"))
                .paths(PathSelectors.ant("/imooc/**"))
                .build();
    }

    //配置Swagger信息
    private ApiInfo apiInfo(){
        Contact contact=new Contact("文杰","http://localhost","272010035@qq.com");

        return  new ApiInfo("狂神的swagger日记", "这个作者有点酷", "V1.0",
                "http://localhost", contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());
    }

}

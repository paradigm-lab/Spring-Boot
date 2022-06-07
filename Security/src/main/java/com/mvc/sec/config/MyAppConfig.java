package com.mvc.sec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
@EnableWebMvc
public class MyAppConfig {

    @Bean
    public ClassLoaderTemplateResolver secondaryTemplateResolver() {
        ClassLoaderTemplateResolver TemplateResolver = new ClassLoaderTemplateResolver();
        TemplateResolver.setPrefix("/views/");
        TemplateResolver.setSuffix(".html");
        TemplateResolver.setTemplateMode(TemplateMode.HTML);
        TemplateResolver.setCharacterEncoding("UTF-8");
        TemplateResolver.setOrder(1);
        TemplateResolver.setCheckExistence(true);

        return TemplateResolver;
    }

}

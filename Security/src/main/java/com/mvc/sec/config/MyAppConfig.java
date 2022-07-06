package com.mvc.sec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import javax.sql.DataSource;

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


    // How can we connect to db: Datasource
    @Bean
    public DataSource datasource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();

        driverManagerDataSource.setUsername("security");
        driverManagerDataSource.setPassword("security");

        // The current Database used for the project
        driverManagerDataSource.setUrl("jdbc:postgresql://postgres-standalone:5432/springsec");
        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");

        return driverManagerDataSource;
    }

}

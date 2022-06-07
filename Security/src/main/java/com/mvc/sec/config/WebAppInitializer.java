package com.mvc.sec.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// Dispatcher Servlet Initallizing
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    // Servlet Configuration Classes
    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] configFiles = {MyAppConfig.class};

        return configFiles;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}

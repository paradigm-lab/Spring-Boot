package com.SpringFramework;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.SpringFramework")
@EnableAspectJAutoProxy
public class BeanConfig {

}

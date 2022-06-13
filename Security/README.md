## @SpringBootApplication is a convenience annotation that adds all the following:
    * @Configuration: Tags the class as a source of bean definitions for the application context.
    * @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings. For example, if spring-webmvc is on the classpath, this annotation flags the application as a web application and activates key behaviors, such as setting up a DispatcherServlet.
    * @ComponentScan: Tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers.

The main() method uses Spring Boot’s SpringApplication.run() method to launch an application.

HTTP request are handled by a controller. You can easily identify the controller by the @Controller annotation.
A View is responsible for rendering the HTML content


# Spring Security
    Why to secure our App?
        JVM (Secured) 
        Server(Tomcat) (Secured)
        myApp (We also need to secure our App)

# Spring Security Filter Chain
    This is a Spring Security Filter chain because it's going to create Spring security filter chain
    Request -> () -> () -> () -> () -> resource
    After that we also need to register the spring security filter chain with our App
    First Initializer then Filter chain.
    Servlet Filter

- Secure URLS endpoints

Note: 
    Server memory is called in-memory 

AuthenticationManagerBuilder - Will help me to create user
AuthenticationProvider
PasswordEncoder 

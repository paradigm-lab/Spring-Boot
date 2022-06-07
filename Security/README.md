## @SpringBootApplication is a convenience annotation that adds all the following:
    * @Configuration: Tags the class as a source of bean definitions for the application context.
    * @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings. For example, if spring-webmvc is on the classpath, this annotation flags the application as a web application and activates key behaviors, such as setting up a DispatcherServlet.
    * @ComponentScan: Tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers.

The main() method uses Spring Boot’s SpringApplication.run() method to launch an application.

HTTP request are handled by a controller. You can easily identify the controller by the @Controller annotation.
A View is responsible for rendering the HTML content
package graphql.tutorial.starter;

import graphql.kickstart.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLHttpServlet;
import graphql.tutorial.starter.resolver.Query;
import graphql.tutorial.starter.service.AttendeeService;
import graphql.tutorial.starter.service.SpeakerService;
import graphql.tutorial.starter.service.TalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DiveIntoGraphqlInJava {

    @Autowired
    private SpeakerService speakerService;

    @Autowired
    private TalkService talkService;

    @Autowired
    private AttendeeService attendeeService;

    public static void main(String[] args) {
        SpringApplication.run(DiveIntoGraphqlInJava.class, args);
    }

    @Bean
	public GraphQLSchema schema() {
        return SchemaParser
            .newParser()
            .file("graphql/schema.graphqls")
//              .dictionary()
            .resolvers(new Query(talkService))    // Adds all the resolver mapping from the schema to our code
            .build()
            .makeExecutableSchema();
	}
}

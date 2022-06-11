package graphql.tutorial.starter.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.tutorial.starter.pojo.Talk;
import graphql.tutorial.starter.service.TalkService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final TalkService talkService;

    public List<Talk> allTalks() {
        return talkService.findAll();
    }
}

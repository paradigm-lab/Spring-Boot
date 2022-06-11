package graphql.tutorial.starter.repository;

import graphql.tutorial.starter.pojo.AttendeeTalk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeTalkRepository extends JpaRepository<AttendeeTalk, Long> {
}

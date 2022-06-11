package graphql.tutorial.starter.repository;

import graphql.tutorial.starter.pojo.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}

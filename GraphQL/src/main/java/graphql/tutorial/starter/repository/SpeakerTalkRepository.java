package graphql.tutorial.starter.repository;

import graphql.tutorial.starter.pojo.SpeakerTalk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerTalkRepository extends JpaRepository<SpeakerTalk, Long> {
}

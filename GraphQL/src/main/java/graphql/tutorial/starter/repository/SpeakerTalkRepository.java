package graphql.tutorial.starter.repository;

import graphql.tutorial.starter.pojo.SpeakerTalk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpeakerTalkRepository extends JpaRepository<SpeakerTalk, Long> {
    List<SpeakerTalk> findAllBySpeakerId(Long speakerId);
    List<SpeakerTalk> findAllByTalkId(Long talkId);
}

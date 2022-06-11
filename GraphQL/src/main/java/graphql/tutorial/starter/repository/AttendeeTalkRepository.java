package graphql.tutorial.starter.repository;

import graphql.tutorial.starter.pojo.AttendeeTalk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendeeTalkRepository extends JpaRepository<AttendeeTalk, Long> {
    List<AttendeeTalk> findAllByAttendeeId(Long attendeeId);
    List<AttendeeTalk> findAllByTalkId(Long talkId);
}

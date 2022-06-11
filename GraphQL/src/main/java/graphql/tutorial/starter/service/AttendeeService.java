package graphql.tutorial.starter.service;

import graphql.tutorial.starter.pojo.Attendee;
import graphql.tutorial.starter.pojo.AttendeeTalk;
import graphql.tutorial.starter.pojo.Talk;
import graphql.tutorial.starter.repository.AttendeeRepository;
import graphql.tutorial.starter.repository.AttendeeTalkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AttendeeService {
    @Autowired
    private AttendeeRepository attendeeRepository;

    @Autowired
    private AttendeeTalkRepository attendeeTalkRepository;


    public List<Attendee> findAll() {
        return attendeeRepository.findAll();
    }

    public List<Attendee> findAllAttendiesForTalk(Talk talk) {
        List<AttendeeTalk> attendeeTalks = attendeeTalkRepository.findAllByTalkId(talk.getId());

        return attendeeTalks.stream()
                .map(e -> attendeeRepository.findById(e.getAttendeeId()))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }
}

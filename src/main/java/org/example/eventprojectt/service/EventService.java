package org.example.eventprojectt.service;

import org.example.eventprojectt.dto.EventResponse;
import org.example.eventprojectt.model.EventD;
import org.example.eventprojectt.model.User;
import org.example.eventprojectt.repository.EventRepository;
import org.example.eventprojectt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
@Autowired
private EventRepository eventRepository;
@Autowired
private UserRepository userRepository;

public EventD createEvent(EventResponse request){
    User organizer=userRepository.findById(request.getOrganizerId())
            .orElseThrow(() -> new RuntimeException("Organizer Bulunamadı"));

    EventD event = new EventD();
    event.setTitle(request.getTitle());
    event.setDate(request.getDateTime());
    event.setStatus(request.getStatus());
    event.setOrganizer(organizer);

    return  eventRepository.save(event);
}

}

package org.example.eventprojectt.controller;

import org.example.eventprojectt.dto.EventResponse;
import org.example.eventprojectt.model.EventD;
import org.example.eventprojectt.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/events")
public class EventController {
@Autowired
    private EventService eventService;

public EventD createEvent(@RequestBody EventResponse request){
    return eventService.createEvent(request);
}
}

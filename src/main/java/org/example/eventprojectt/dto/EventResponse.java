package org.example.eventprojectt.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.eventprojectt.model.EventStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventResponse {
    private  String title;
    private LocalDateTime dateTime;
    private EventStatus status;
    private  Long organizerId;
}

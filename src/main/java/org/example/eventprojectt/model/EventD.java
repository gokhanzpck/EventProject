package org.example.eventprojectt.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "event_date")
    private LocalDateTime date;
    @Enumerated(EnumType.STRING)
    private EventStatus status;
    @ManyToOne
    @JoinColumn(name = "organizer_id")
    private  User organizer;


}

package org.example.eventprojectt.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "ticket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     @Column(unique = true,nullable = false)
    private UUID ticketUuid; //Bu alanın amacı, her bilet için dünyada tek olacak bir kimlik üretmek ve bunu QR kodunun içine gömmektir.
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "event_id",nullable = false)
    private EventD eventD;
    @Column(name = "isUsed",nullable = false)
    private  boolean used=false;

}

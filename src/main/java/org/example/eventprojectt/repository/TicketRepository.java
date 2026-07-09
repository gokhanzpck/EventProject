package org.example.eventprojectt.repository;

import org.example.eventprojectt.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {

}

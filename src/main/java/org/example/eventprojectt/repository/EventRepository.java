package org.example.eventprojectt.repository;

import org.example.eventprojectt.model.EventD;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventD,Long> {

}

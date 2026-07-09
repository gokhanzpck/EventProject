package org.example.eventprojectt.repository;

import org.example.eventprojectt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

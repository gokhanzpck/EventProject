package org.example.eventprojectt.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@Column(name = "email")
      private String email;
@Column(name = "password")
    private String password;
@Enumerated(EnumType.STRING)
@Column(name = "role",nullable = false)
   private Role role;
@OneToMany(mappedBy = "organizer")
    private List<EventD> eventDS;

}

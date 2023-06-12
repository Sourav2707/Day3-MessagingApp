package com.bridgelabz.greetingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
}

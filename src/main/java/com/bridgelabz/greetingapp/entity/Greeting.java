package com.bridgelabz.greetingapp.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Greeting {
    private long id;
    String message;
}
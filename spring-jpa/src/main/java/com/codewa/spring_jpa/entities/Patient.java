package com.codewa.spring_jpa.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Patient {
    private Long id;
    private String name;
    private Date birth;
    private boolean isSick;
    private int score;
}

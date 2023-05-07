package com.codecool.supersprinter3000.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Task {
    private int id;
    private String title;
    private String description;
    private Double estimationTime;

}

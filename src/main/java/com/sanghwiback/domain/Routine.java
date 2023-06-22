package com.sanghwiback.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Routine {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String uniqueID;
    private int index;
    private String name;
    private String description;
    private String regDate;
    private String updateDate;
    private String time_s;
    private String time_e;
    @OneToMany
    private List<Activity> activities;
}

package com.sanghwiback.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
public class Goal {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String uniqueID;

    private int index;
    private String name;
    private String description;
    private String regDate;
    private String updateDate;
//    @OneToMany
//    private List<Routine> routines;
    private boolean isFold = false;
    @Column(name = "timeS")
    private String time_s;
    @Column(name = "timeE")
    private String time_e;
}

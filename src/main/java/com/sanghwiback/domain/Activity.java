package com.sanghwiback.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Activity {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String uniqueID;
    private int index;
    private String name;
    private String description;
    private String regDate;
    private String updateDate;
    private int categoryValue;
    private String time_s;
    private String time_e;
    private boolean isDailyActive;
    @ElementCollection
    private Set<Integer> activeWeekDays;
    private boolean isWeekendActive;
    @ElementCollection
    private Set<Integer> activeWeekends;
    private boolean isActive;
    private int completionRatio;
    private int ratioCompletion;
    private int completionCount;
    private int countCompletion;
    private int completionAs;
}

package com.doodle.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class Participant {

    @Id
    private Long id;

    private String name;

    private String preferences;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getPreferences() {
        List<Integer> preferences = Arrays.asList(this.preferences.split(","))
                .stream()
                .map(value -> Integer.parseInt(value))
                .collect(Collectors.toList());

        return preferences;
    }

    public void setPreferences(List<Integer> preferences) {
        String values = preferences.stream()
                .map(pref -> String.valueOf(pref))
                .collect(Collectors.joining(","));
        this.preferences = values;
    }
}

package com.benji.harryPotterProject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum House {
    HUFFLEPUFF("Hufflepuff"),
    GRYFFINDOR("Gryffindor"),
    RAVENCLAW("Ravenclaw"),
    SLYTHERIN("Slytherin");

    public final String name;

    public static House getRandomHouse() {
        return values()[(int) (Math.random() * values().length)];
    }
}

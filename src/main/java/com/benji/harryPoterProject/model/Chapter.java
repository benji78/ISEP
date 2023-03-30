package com.benji.harryPoterProject.model;

import com.benji.harryPoterProject.model.characters.Boss;
import lombok.Getter;

public class Chapter {
    @Getter
    private final String name;
    @Getter
    private final int number;
    @Getter
    private final Boss boss;

    public Chapter(int number) {
        this.number = number;
        switch (number) {
            case 1 -> {
                this.name = "The Philosopher's Stone";
                this.boss = new Boss("Troll", 100, 10, 20);
            }
            case 2 -> {
                this.name = "The Chamber of Secrets";
                this.boss = new Boss("The Basilisk", 100, 10, 20);
            }
            case 3 -> {
                this.name = "The Prisoner of Azkaban";
                this.boss = new Boss("The Dementor", 100, 10, 20);
            }
            case 4 -> {
                this.name = "The Goblet of Fire";
                this.boss = new Boss("Voldemort and Peter Pettigrow", 100, 10, 20);
            }
            case 5 -> {
                this.name = "The Order of the Phoenix";
                this.boss = new Boss("Dolores Ombrage", 100, 10, 20);
            }
            case 6 -> {
                this.name = "The Half-Blood Prince";
                this.boss = new Boss("The Death Eaters", 100, 10, 20);
            }
            case 7 -> {
                this.name = "The Deathly Hallows";
                this.boss = new Boss("Voldemort and Bellatrix Lestrange", 100, 10, 20);
            }
            default -> throw new IllegalStateException("Unexpected value: " + number);
        }
    }
}

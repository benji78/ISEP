package com.benji.harryPoterProject.model.characters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Character {

    private int health;
    private int defence;
    private int attackDamage;

    public void attack(Character character) {

    }
}

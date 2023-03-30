package com.benji.harryPoterProject.model.characters;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractEnemy extends Character {
    private String name;

    public AbstractEnemy(String name, int health, int defense, int attackDamage) {
        super(health, defense, attackDamage);
        this.name = name;
    }
}

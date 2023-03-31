package com.benji.harryPoterProject.model.characters;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractEnemy extends Character {
    public AbstractEnemy(String name, int maxHealth, int health, int defense, int attackDamage) {
        super(name, maxHealth, health, defense, attackDamage);
    }
}

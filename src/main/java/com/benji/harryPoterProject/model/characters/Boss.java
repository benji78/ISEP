package com.benji.harryPoterProject.model.characters;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Boss extends AbstractEnemy {
    public Boss(String name, int health, int defense, int attackDamage) {
        super(name, health, defense, attackDamage);
    }
}

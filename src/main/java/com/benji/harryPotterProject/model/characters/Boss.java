package com.benji.harryPotterProject.model.characters;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Boss extends AbstractEnemy {
    public Boss(String name, int maxHealth, int health, int defense, int attackDamage) {
        super(name, maxHealth, health, defense, attackDamage);
    }

    @Override
    public int attack(Character character, int attackDamage) {
        return 0;
    }
}

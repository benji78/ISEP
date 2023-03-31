package com.benji.harryPoterProject.model.characters;

public class Enemy extends AbstractEnemy {
    public Enemy(String name, int maxHealth, int health, int defense, int attackDamage) {
        super(name, maxHealth, health, defense, attackDamage);
    }

    @Override
    public int attack(Character character, int attackDamage) {
        return 0;
    }
}

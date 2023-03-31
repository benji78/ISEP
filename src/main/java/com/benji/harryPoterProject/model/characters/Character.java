package com.benji.harryPoterProject.model.characters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Character {
    private String name;
    private int maxHealth;
    protected int health;
    private int defence;
    private int attackDamage;

    public abstract int attack(Character character, int attackDamage);

    public int takeDamage(int points) {
        health = Math.max(0, health - points);
        return health;
    }
}

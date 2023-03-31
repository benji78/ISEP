package com.benji.harryPotterProject.model.characters;

import com.benji.harryPotterProject.model.*;
import com.benji.harryPotterProject.model.spells.Spell;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Wizard extends Character {
    private Pet pet;
    private Wand wand;
    private House house;
    private List<Spell> knownSpells;
    private List<Potion> potions;

    public Wizard(String name, House house, Pet pet) {
        super(name, 100, 100, 10, 10);
        // create a wand with a random core and a length between 8 and 20 ((0 to 12)+8)
        wand = new Wand(Core.values()[(int) (Math.random() * Core.values().length)], (int) (Math.random() * 13) + 8);
        this.house = house;
        this.pet = pet;
        applyHouseBuff();
    }

    @Override
    public int attack(Character character, int attackDamage) {
        character.takeDamage(attackDamage);
        return 0;
    }

    public int defend() {
        return 0;
    }

    public void heal(int points) {
        health = Math.min(getMaxHealth(), health + points);
    }

    private void applyHouseBuff() {
        switch (house) {
            // Gryffindor wizards are more resistant to damage
            case GRYFFINDOR -> setMaxHealth(getMaxHealth() + 10);
            // Slytherin wizards deal more damage with spells
            case SLYTHERIN -> setAttackDamage(getAttackDamage() + 5);
            // Hufflepuff wizards are more effective with potions
//            case HUFFLEPUFF -> setPotionEffectiveness(getPotionEffectiveness() + 0.2);
            // Ravenclaw wizards are more accurate with spells
//            case RAVENCLAW -> setSpellAccuracy(getSpellAccuracy() + 0.1);
//            @TODO
        }
    }

}

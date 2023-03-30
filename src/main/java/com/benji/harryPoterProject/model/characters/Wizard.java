package com.benji.harryPoterProject.model.characters;

import com.benji.harryPoterProject.model.*;
import com.benji.harryPoterProject.model.spells.Spell;
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

    public Wizard() {
        super(100, 10, 10);
        wand = new Wand(Core.values()[(int) (Math.random() * Core.values().length)], (int) (Math.random() * 50));
        pet = Pet.values()[(int) (Math.random() * Pet.values().length)];
    }

    public void defend() {
        // TODO
    }
}

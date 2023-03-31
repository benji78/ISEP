package com.benji.harryPotterProject.model.spells;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ForbiddenSpell extends AbstractSpell {
    private String effect;
    private final int energyCost;

    public ForbiddenSpell(String name, int energyCost, int damage) {
        super(name, damage);
        this.energyCost = energyCost;
    }
}

package com.benji.harryPoterProject.model.spells;

public class ForbiddenSpell extends AbstractSpell {
    private String effect;
    private final int energyCost;

    public ForbiddenSpell(String name, int energyCost, int damage) {
        super(name, damage);
        this.energyCost = energyCost;
    }
}

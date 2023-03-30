package com.benji.harryPoterProject.model.spells;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractSpell {

    private String name;
    private int energyCost;
    private int damage;
}

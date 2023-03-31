package com.benji.harryPotterProject.model.spells;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class AbstractSpell {
    private final String name;
    private final int damage;
}

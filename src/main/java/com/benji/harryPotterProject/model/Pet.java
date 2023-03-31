package com.benji.harryPotterProject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Pet {
    OWL("owl"),
    CAT("cat"),
    TOAD("toad"),
    RAT("rat"),
    HEDGEHOG("hedgehog"),
    RABBIT("rabbit"),
    PEACOCK("peacock");

    private final String name;
}

package com.benji.harryPoterProject.controller;

import com.benji.harryPoterProject.model.Potion;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class PotionController {
    private final List<Potion> potions;

    public PotionController() {
        potions = new ArrayList<>();
        potions.add(new Potion("Potion of Healing", "Heals 10 HP", ""));
    }
}

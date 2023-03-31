package com.benji.harryPotterProject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Core {
    PHOENIX_FEATHER("phoenix feather"),
    DRAGON_HEARTSTRING("dragon heartstring"),
    UNICORN_TAIL_HAIR("unicorn tail hair"),
    VEELA_HAIR("veela hair"),
    THESTRAL_TAIL_HAIR("thestrals tail hair"),
    TROLL_WHISKER("troll whisker"),
    CORAL("coral"),
    HORNED_SERPENT_HORN("horned serpent horn"),
    BASILISK_HORN("basilisk horn");

    private final String name;
}

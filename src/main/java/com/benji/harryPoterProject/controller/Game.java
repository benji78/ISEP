package com.benji.harryPoterProject.controller;

import com.benji.harryPoterProject.model.House;
import com.benji.harryPoterProject.model.Pet;
import com.benji.harryPoterProject.model.characters.Boss;
import com.benji.harryPoterProject.model.characters.Wizard;
import com.benji.harryPoterProject.view.Console;
import com.benji.harryPoterProject.view.InputParser;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

@Getter
public class Game {
    private final InputParser inputParser = new InputParser(System.in);
    private boolean gameFinished = false;
    private Wizard player;

    public void start() {
        Console.print("Welcome to this Harry Potter RPG!");
        String playerName = Console.requestString("Please enter your name: ");
        Console.print("\"You are a wizard " + playerName + "!");
        House house = House.getRandomHouse();

        getIntro(house);

        Console.print("It's now time to choose your pet. Here are the options:");
        for (int i = 0; i < Pet.values().length; i++) {
            Console.print((i + 1) + ". " + Pet.values()[i]);
        }
        int pet = inputParser.getInt(1, Pet.values().length);
        player = new Wizard(playerName, house, Pet.values()[pet - 1]);
        Console.print("You are now the proud owner of a " + player.getPet().getName() + "!");

        Console.print("\nIt's now time for your future wand to choose you.");
        Console.print("Your wand is " + player.getWand().getLength() + "¾ inches and has a " + player.getWand().getCore().getName() + " core.");

        Console.print("\nYou are now ready to start the adventure!");

        ChapterController chapterController = new ChapterController();
        do {
            Console.print("\n" + chapterController.getChapter().getName());
            printMenu();
            switch (Console.getInputParser().getInt(1, 3)) {
                case 1 -> {
                    battle(chapterController.getChapter().getBoss());
                    gameFinished = chapterController.nextChapter(); // Check if player has finished the last chapter
                }
                case 2 -> playerInfo(player);
                case 3 -> gameFinished = true;
            }
        } while (!gameFinished);

    }

    private void battle(@NotNull Boss boss) {
        boolean fighting = true;
        Console.print("You are fighting " + boss.getName() + "!");
        Console.print("They have " + boss.getHealth() + "/" + boss.getMaxHealth() + " health points.");
        do {
            Console.print("Choose an action:");
            Console.print("1. Attack");
            Console.print("2. Drink potion");

            switch (Console.getInputParser().getInt(1, 2)) {
                case 1 -> {
                    boss.takeDamage(player.getAttackDamage());
                    Console.print("You attacked " + boss.getName() + "!");
                    Console.print(boss.getName() + " has " + boss.getHealth() + "/" + boss.getMaxHealth() + " health points left.");
                }
                case 2 -> {
                    player.heal(20);
                    Console.print("You drank a potion!");
                    Console.print("You have " + player.getHealth() + "/" + player.getMaxHealth() + " health points left.");
                }
            }
            if (boss.getHealth() == 0) {
                Console.print("You defeated " + boss.getName() + "!");
                Console.print("You advance to the next year!");
                player.heal(player.getMaxHealth()); // Heal player to max health before next chapter
                fighting = false;
            } else {
                Console.print(boss.getName() + " attacked you!");
                if (player.takeDamage(boss.getAttackDamage()) == 0) {
                    playerDied();
                    fighting = false;
                } else {
                    Console.print("You have " + player.getHealth() + "/" + player.getMaxHealth() + " health points left.");
                }
            }
        } while (fighting);
    }

    private void playerInfo(Wizard player) {
        Console.print("You are a wizard!");
        Console.print("You have " + player.getHealth() + "/" + player.getMaxHealth() + " health points.");
        Console.print("You have " + player.getAttackDamage() + " attack damage.");
        Console.print("You have " + player.getPotions().size() + " potions in your inventory.");
    }

    private void playerDied() {
        Console.print("You died! Game over!");
        Console.print("Hope you will do better next time!");
        Console.closeParser();
        gameFinished = true;
    }

    private void getIntro(@NotNull House house) {
        Console.print("""
                Never forget that!" says Hagrid as he waves goodbye.

                As you board the Hogwarts Express, you can't help but feel a sense of excitement and anticipation. You are a wizard, and this is your first year at Hogwarts School of Witchcraft and Wizardry. You find an empty compartment and settle in for the journey.

                As the train chugs along, you look out the window and see the Hogwarts castle looming in the distance.

                When you arrive at the school, you are ushered into the Great Hall for the sorting ceremony. The headmaster, Dumbledore, welcomes the first years and explains the sorting process.""");
        Console.requestString("\nPress enter to continue...");
        Console.print("""
                As each student's name is called, they approach a tattered old hat sitting on a stool. The hat magically sorts them into one of four houses: Gryffindor, Hufflepuff, Ravenclaw, or Slytherin.

                Your heart racing, you take your place in line and watch as the hat is placed on your head. You feel a strange sensation as the hat begins to speak directly into your mind.

                "Ah, a strong mind, I see. And a quick wit. Plenty of courage, too. But where to put you? This is a tricky one."

                You hold your breath as the hat deliberates. Finally, it announces your house to the hall.

                """ + house.getName() + "!\n\nA cheer goes up from the " + house.getName() + " table, and you feel a sense of belonging settle over you. You take your seat at the table, feeling grateful and excited for the year to come."
        );
        Console.requestString("\nPress enter to continue...");

    }

    private void printMenu() {
        Console.print("Choose an action :");
        Console.print("1. Continue your journey");
        Console.print("2. Get stats");
        Console.print("3. Exit the game");
    }
}

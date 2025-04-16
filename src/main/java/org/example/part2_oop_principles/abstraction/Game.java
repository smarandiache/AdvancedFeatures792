package org.example.part2_oop_principles.abstraction;

public abstract class Game {

    abstract void initialize();
    abstract void play();

    public void start() {
        System.out.println("Game is starting...");
    }

    public final String printSlogan() {
        return "Games are nice!";
    }
}

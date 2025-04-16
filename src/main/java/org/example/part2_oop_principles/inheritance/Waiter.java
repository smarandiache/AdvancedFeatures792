package org.example.part2_oop_principles.inheritance;

public class Waiter extends Employee {

    public Waiter(
            String id,
            String name,
            String surname,
            int age,
            double tips
    ) {
        super(id, name, surname, age);
        this.tips = tips;
    }

    private double tips;

    @Override
    public void sayHi() {
        System.out.println("Hi! I am a waiter!");
    }
}

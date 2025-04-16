package org.example.part2_oop_principles.inheritance;

/*
    Definitie: Mostenirea permite unei clase (clasa copil/sub-clasa)
    sa preia proprietati si metode dintr-o clasa existenta (clasa parinte/clasa de baza)
 */

public class Employee {

    protected String id;
    protected String name;
    protected String surname;
    protected int age;

    public Employee(
            String id,
            String name,
            String surname,
            int age
    ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void sayHi() {
        System.out.println("Hi! I am an employee!");
    }

    public final String generateText() {
        return "test test test";
    }
}

package org.example.part2_oop_principles.inheritance;

public class Chef extends Employee {

    private String seniority;

    public Chef(
            String id,
            String name,
            String surname,
            int age,
            String seniority
    ) {
        super(id, name, surname, age);
        this.seniority = seniority;
    }

    @Override
    public void sayHi() {
        super.sayHi();
        // daca metoda din clasa parinte ar fi returnabila, atunci ati putea stoca
        // rezultatul intr-o variabila pe care sa o manipulati dupa context
        System.out.println(super.id);
    }
}

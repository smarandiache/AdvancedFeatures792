package org.example.part1_class_types;

import org.example.part1_class_types.class_abstract.AbstractAnimal;
import org.example.part1_class_types.class_abstract.Bird;
import org.example.part1_class_types.class_abstract.Dog;
import org.example.part1_class_types.class_enum.AccessRole;
import org.example.part1_class_types.class_enum.Day;
import org.example.part1_class_types.class_final.BankAccount;
import org.example.part1_class_types.class_final.MathUtils;
import org.example.part1_class_types.class_interface.Crocodile;
import org.example.part1_class_types.class_interface.InterfaceAnimal;
import org.example.part1_class_types.class_interface.Parrot;
import org.example.part1_class_types.class_object_concrete.ConcreteAnimal;
import org.example.part1_class_types.multiple_inheritance.ElectricCar;

public class Main {
    public static void main(String[] args) {
        /* Clasa de obiect / Clasa concreta */
        ConcreteAnimal concreteAnimalObject1 = new ConcreteAnimal();
        concreteAnimalObject1.setRasa("pisica");
        concreteAnimalObject1.setVarsta(3);

        ConcreteAnimal concreteAnimalObject2 = new ConcreteAnimal("caine", 2);

        System.out.println("Afisari ale unei clase de obiect (concrete): ");
        System.out.println(concreteAnimalObject1);
        System.out.println(concreteAnimalObject2 + "\n");

        /* Abstract Class */
        //AbstractAnimal abstractAnimalObject = new AbstractAnimal(); -> 'Abstractanimal' is abstract; cannot be instantiated
        System.out.println("Afisari ale unei clase abstracte (parent) si a claselor mostenite (sub-classes)");
        Dog dogObject = new Dog();
        dogObject.eat();
        dogObject.makeSound();
        Bird birdObject = new Bird();
        birdObject.eat();
        birdObject.makeSound();
        System.out.println();

        /* Interface */
        System.out.println("Afisari din interfata si clasa de implementare: ");
        InterfaceAnimal animalObject1 = new Crocodile();
        // e relevant in cazul in care avem o relatie unica de implementare
        // o interfata e implementata de o clasa de implementare
        // clasa de implementare implementeaza O SINGURA interfata unica
        Crocodile crocodileObject = new Crocodile();
        animalObject1.doSound();
        crocodileObject.doSound();

        InterfaceAnimal animalObject2 = new Parrot();
        Parrot parrotObject = new Parrot();
        animalObject2.doSound();
        parrotObject.doSound();

        /* Multiple Inheritance */
        ElectricCar electricCar = new ElectricCar("Opel", "Astra", 2020, 93, 500);
        electricCar.displayStatus();
        electricCar.chargeBattery();
        electricCar.navigateTo("Suceava");

        /* Final Class */
        MathUtils mathUtils = new MathUtils();
        System.out.println(mathUtils.CONSTANT_TEXT);
//        mathUtils.constantText = "Alune"; -> cannot assign a value to final variable 'CONSTANT_VALUE'
//        MathUtils.MAX_VALUE = 98; -> cannot assign a value to final variable 'MAX_VALUE'

        BankAccount bankAccount = new BankAccount("123124");
        bankAccount.display();
        System.out.println();

        /* Enum Class */
        Day dayOne = Day.LUNI;
        Day dayThree = Day.MIERCURI;
        Day daySix = Day.SAMBATA;
        System.out.println(dayOne);
        System.out.println(dayOne + " " + dayOne.ordinal());
        System.out.println(dayThree + " " + dayThree.ordinal());
        System.out.println(daySix + " " + daySix.ordinal());

        AccessRole newRole = AccessRole.ADMIN;
        System.out.println(newRole.getPriority() + " " + newRole.getAccessLevel());

//        AccessRole otherTole = new AccessRole("Wow", 0); // -> utilizati final class, altfel pre compile error
//        AccessRole otherTole = AccessRole("Wow", 0); // -> utilizati final class, altfel pre compile error
    }
}

package org.example.part2_oop_principles;

import org.example.part2_oop_principles.composition.Car;
import org.example.part2_oop_principles.composition.Engine;
import org.example.part2_oop_principles.encapsulation.UserAccount;
import org.example.part2_oop_principles.inheritance.Chef;
import org.example.part2_oop_principles.inheritance.Employee;
import org.example.part2_oop_principles.inheritance.Waiter;
import org.example.part2_oop_principles.polymorphism.Developer;
import org.example.part2_oop_principles.polymorphism.FrontEndDev;

public class Main {

    public static void main(String[] args) {
        /* Encapsulation */
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("asmara0803");
        userAccount.setPassword("catelusCuParulCret14*");

        System.out.println(userAccount);

        System.out.println(userAccount.getUsername());

        /* Inheritance */
        Employee employee = new Employee("1234", "Asmara", "Diache", 23);
        Chef chef = new Chef("8485", "Ion", "Mar", 23, "Ajutor bucatar");
        Waiter waiter = new Waiter("5678", "Maria", "Nel", 29, 56.2);

        System.out.println("Input din parent class Employee: " + employee.generateText());
        employee.sayHi();

        System.out.println("Input din parent class Chef: " + chef.generateText());
        chef.sayHi();

        System.out.println("Input din parent class Waiter: " + waiter.generateText());
        waiter.sayHi();

        /* Polymorphism */
        Developer developer = new Developer();
        FrontEndDev frontEndDev = new FrontEndDev();

        developer.work();
        frontEndDev.work();

        System.out.println(developer.add(3,5));
        System.out.println(developer.add(3.5,7.4));
        System.out.println(developer.add(51516353856L, -56151578515L));

        /* Composition */
        Engine engine = new Engine(34, "mare rau");
        Car car = new Car(engine, "WV", "Golf 7", "B1234WOW");

        System.out.println(engine);
        System.out.println(car);
    }
}

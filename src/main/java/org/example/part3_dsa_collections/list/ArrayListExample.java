package org.example.part3_dsa_collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

// CRUD - create, read, update, delete
// - de avut in vedere la algoritmii iterativi pe arrays

// Insertis presupune SHIFTAREA elementelor la DREAPTA
// prin incrementarea dimensiunii cu numarul de pozitii shiftate

// Stergerea pesupune SHIFTAREA elemnetelor laa STANGA
// prin decrementarea dimensiunii cu numarul de pozitii shiftate

// Inversarea presupune creasrea unei noi structuri de date porning de la
// ultimul element al structurii originale.
// HINT: for ( i = size - 1, i >= 0, i--) -> add in lista
// HINT: for mirror pana la size/2 ->
// aux = elementul 1
// elemtul 1 = elementul size - 1
// elementul size - 1 = aux

public class ArrayListExample {

    public static void main(String[] args) {
        // Putem defini o structura de date fie dupa Interfata implementata, fie dupa clasa de implementare
        // Atata timp cat initializarea se face folosind MEREU constructorul clasei de implementare
        List<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        names.add("Nume 1");
        names.add("Nume 2");
        names.add("Nume 3");
        names.add("Nume 4");

        for (int i = 0; i<names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }

        System.out.println("\n------------------------ dupa adaugare");

        names.addAll(List.of("Nume 5", "Nume 6"));
        names.addAll(2,List.of("Nume 7", "Nume 8"));

        for (int i = 0; i<names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }


        System.out.println("\n------------------------ it");

        for (String it: names) {
            System.out.print(it + " ");
        }

        names.remove("Nume 3");
        names.remove(5);
        names.removeAll(List.of("Nume 2", "Nume 7"));

        System.out.println("\n------------------------ remove");

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        System.out.println("\n------------------------ reverse");
        List<String> reversedNames = names.reversed();
        // reversed creeaza o noua lista cu elemente inversate
        // astfel incat lista originala ramane neschimbata
        System.out.println(names);
        System.out.println(names.reversed());
        System.out.println(reversedNames);
    }

}

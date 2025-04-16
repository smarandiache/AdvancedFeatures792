package org.example.part2_oop_principles.polymorphism;

/*
    Definitie: Polimorfismul permite apelarea aceleasi metode pe obiecte de tipuri
    de date diferite, comportamentul fiind specific fiecarui obiect.

    Se poate manifesta in 2 moduri:
    - polimorfism static - compile time - prin supraincarcarea unui set de metode
        -- se intampla DOAR la nivelul clasei in care exista un set de metode
        -- se pastreaza denumirea metodei, dar se schimba atat semnatura, cat si implementarea
    polimorfismul dinamic - runtime - prin suprascrierea metodelor
        -- se intampla exclusiv in momentul unei relatii de mostenire intre clase,
        astfel incat clasa copil poate suprascrie metodele din clasa parinte
        -- se pastreaza semnatura metodei, dar se schimba corpul de implementare

 */

public class Developer {

    // polimorfism dinamic - suprascriere in basa mostenirii
    public void work(){
        System.out.println("Developer works");
    }

    // polimorfism static - supraincarcare in baza redefinirii
    // metodelor in functie de inputul returnat/trimis
    // merge si pe metode void unde schimbati corpul de implementare sau/si
    // argumentele pasate
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public long add(long a, long b) {
        return a + b;
    }
}

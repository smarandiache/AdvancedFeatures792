package org.example.part1_class_types.class_interface;

/*
    Ce este?
        O interfata este o clasa care defineste un contract de implementare al unor metode functionale.
        De regula, contine DOAR declaratia metodelor SIMILAR claselor abstracte care pot stoca metode abstracte.

        InterfaceClass abc = new ImplementationClass();
        ImplementationClass implements InterfaceClass

        Cand le utilizam?
            - cand dorim sa decuplam partea functionala a unei serii de clase in scopul generalizarii
            - cand vrem sa imbunatatim optimizarea ierarhiilor

        Intrebare capcana: Se poate face in Java MUTLIPLE INHERITANCE? (mostenire multipla)
            - ChildClass extends ParentClass1 -> corect putem
            - ChildClass extends ParentClass1, Parenclass2 -> incorect, nu putem

            - putem simula o pseudo mostenire multiple dpdv al comportamentului functional
            - ChildClass implements ParentInterface1, ParentInterface2, ParentInterface3, ParentInterface4 -> corect, putem
                -- inseamna ca ChildClass va implementa TOATE METODELE din fiecare interfata

            - ChildClass extends ParentClass implements ParentInterface1, ParentInterface2, ParentInterface3, ParentInterface4
                -- ParentClass va stoca toate atributele generice pe care am putea sa le avem in ParentClass1,2,3,4...
                -- Interfetele vor decupla contractul comportamentul al metodelor functionala pe mai multe interfete specifice
 */

public interface InterfaceAnimal {

    void doSound();

}

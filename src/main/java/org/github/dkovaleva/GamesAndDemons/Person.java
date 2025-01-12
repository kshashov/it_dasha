package org.github.dkovaleva.GamesAndDemons;

public class Person {
    String name;
    int age;

//    Person() {
//        this("Undefined", 18);
//    }
//
//    Person(String name) {
//        this(name, 18);
//    }

    {
        name = "Undefined";
        age = 18;
    }

    Person() {
    }

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}

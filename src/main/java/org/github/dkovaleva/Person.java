package org.github.dkovaleva;

import java.util.Objects;

public class Person {
    private String name;
    public boolean isMale;
    public String weapon;
    public int rarity;

    public Person() {
        name = "не задано";
        System.out.println("конструктор без параметров");
    }
//
//    public Person(String name) {
//        this.name = name;
//        System.out.println("конструктор с именем");
//    }

    public Person(String name, String weapon) {
        setName(name);
        this.weapon = weapon;
        rarity = 1;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //    public String introduce() {
//        String text = " " + name + " c " + weapon + " и редкостью " + rarity;
//        if (isMale) {
//            return "Парень" + text;
//        } else {
//            return "Девушка" + text;
//        }
//    }

    public void rename(String name) {
        this.name = name;
    }

    public String introduce() {
        String sex = "Девушка";
        if (isMale) {
            sex = "Парень";
        }

        String res = "";
        String star = "*";
        for (int i = 0; i < rarity; i++) {
            res = res + star;
        }

        String result = sex + " " + name + " " + res + " c " + weapon;

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return isMale == person.isMale && rarity == person.rarity && Objects.equals(name, person.name) && Objects.equals(weapon, person.weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isMale, weapon, rarity);
    }
}




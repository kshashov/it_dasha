package org.github.dkovaleva;

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

}




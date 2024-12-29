package org.github.dkovaleva;

public class Person {
    public String name;
    public boolean isMale;
    public String weapon;
    public int rarity;


//    public String introduce() {
//        String text = " " + name + " c " + weapon + " и редкостью " + rarity;
//        if (isMale) {
//            return "Парень" + text;
//        } else {
//            return "Девушка" + text;
//        }
//    }

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




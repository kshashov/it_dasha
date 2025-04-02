package org.github.dkovaleva.people;

import java.util.HashMap;

public class HashMapTestHW {
    public static void main(String[] args) {

        HashMap<Human, Integer> phoneBook = new HashMap<>();
        Human k = new Human("Kate", 1923, 523);
        Human f = new Human("Fate", 1923, 24);
        Human kk = new Human("Kate", 1923, 523);
        Human a = new Human("Alena", 1964, 300);
        Human s = new Human("Элечка", 2006, 10);
        Human o = new Human("Olenka", 1978, 3);

        phoneBook.put(k, 123456);
        phoneBook.put(a, 4567);
        phoneBook.put(f, 678909);


//        System.out.println(phoneBook);
//
//        phoneBook.put(kk, 98765);
//        phoneBook.put(f, 1235);
//        System.out.println(phoneBook);
        System.out.println(o.equals(64));
    }
}

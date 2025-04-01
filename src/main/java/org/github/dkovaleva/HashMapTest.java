package org.github.dkovaleva;

import java.util.HashMap;
import java.util.Random;

public class HashMapTest {
    public static void main(String[] args) {
        System.out.println("test" == "test");
        System.out.println(new String("test") == new String("test"));

        MyClass ob1 = new MyClass("1");
        MyClass ob2 = new MyClass("2");

//        System.out.println(ob1.hashCode() + " " + ob2.hashCode());

        HashMap<MyClass, String> hm = new HashMap<>();
        hm.put(new MyClass("1"), "1");
        MyClass key = new MyClass("1");
        hm.put(key, "2");
        hm.put(key, "3");

//        hm.remove(key);

        System.out.println(hm);

    }

    public static class MyClass {
        private final int pseudoHashCode;
        public String text;

        public MyClass(String text) {
            this.text = text;
            this.pseudoHashCode = new Random().nextInt();
        }

        @Override
        public int hashCode() {
            return text.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MyClass mc) {
                return text.equals(mc.text);
            }

            return false;
        }

        @Override
        public String toString() {
            return "MyClass{" +
                    "text='" + text + '\'' +
                    '}';
        }
    }
}


package org.github.dkovaleva;

public class SuperLinkedList3 {
    private Numbers start0; //ссылка на первый не существующий объект

    public int get(int i) {

        return 0;
    }

    public void set(int i, int num) {

    }

    public void remove(int i) {

    }

    public void addFirst(int numberFirst) {
        Numbers first = new Numbers(); //создаём новый объект
        first.value = numberFirst;  // записываем у него значение
        first.linkNext = start0; //ссылка на следующий объект записывается в изначальную созданную
        start0 = first; // изначальная созданная ссылка указывает на созданный нами объект
    }


    public void add(int i, int number) {
        if (i == 0) {
            addFirst(number);
        }
        if (i > 0) {

        }
    }

    public int size() {
        if (start0 == null) {
            return 0;
        }

        int count = 0;

        //TODO
        count++;
        return 0;
    }

    private Numbers getNum(int i) {
        if (i < 0 || i > 5) {
            int o;
        }
        return new Numbers();//не верно. просто чтобы не горело красным
    }


    public static class Numbers {
        public int value;
        public Numbers linkNext;
    }


//    public static void main(String[] args) {
//        SuperLinkedList3 list = new SuperLinkedList3();
//
//        for (int i = 0; i < 10; i++) {
//            list.add(i, i + 1);
//        }
//
//        System.out.println(list);
//
//        list.delete(5);
//        list.delete(0);
//        list.delete(7);
//
//        System.out.println(list);
//
//        list.addFirst(3456);
//
//        System.out.println(list);
//
//    }
}

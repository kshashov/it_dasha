package org.github.dkovaleva.GamesAndDemons;

public class TimeMachine {

    public void goFuture(int currentYear) {
        currentYear = currentYear + 10;
    }

    public void goPast(int currentYear) {
        currentYear = currentYear - 10;
    }

    public void goFuture(Cat cat) {
        cat.age += 10;
    }

    public void goPast(Cat cat) {
        cat.age += 10;
    }


    public static void main(String[] args) {
//        TimeMachine timeMachine = new TimeMachine();
//        int currentYear=2020;
//
//        System.out.println("бла бла");
//        System.out.println(currentYear);
//        timeMachine.goPast(currentYear);
//        System.out.println(currentYear);

        TimeMachine timeMachine = new TimeMachine();
        Cat barsik = new Cat(5);
        Cat hui = barsik;

        System.out.println("Сколько лет Барсику в самом начале работы программы?");
        System.out.println(barsik.age);

        timeMachine.goFuture(barsik);
        System.out.println("А теперь?");
        System.out.println(barsik.age);

        System.out.println("Елки-палки! Барсик постарел на 10 лет! Живо гони назад!");
        timeMachine.goPast(barsik);
        System.out.println("Получилось? Мы вернули коту его изначальный возраст?");
        System.out.println(barsik.age);

    }
}

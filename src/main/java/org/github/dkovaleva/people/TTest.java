package org.github.dkovaleva.people;

public class TTest {
    public static void main(String[] args) {
        //Написать функцию, принимающую параметр int n и печатающую в консоль n строк состоящих от 1 до n звездочек
        //
        //Пример:
        //printStar(8)
        //*
        //**
        //***
        //****
        //*****
        //******
        //*******
        //********

        printStar(5);

    }

    public static void printStar(int rows) {
        String star = "*";
        String result = "";
        for (int i = 0; i < rows; i++) {
            result = "";
            for (int j = 0; j <= i; j++) {
                result += star;

            }
            System.out.println(result);
        }
    }
}

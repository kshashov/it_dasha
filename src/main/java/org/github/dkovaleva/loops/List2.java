package org.github.dkovaleva.loops;

public class List2 {
    public static void main(String[] args) {
        String result = "";
        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                result = result + j;

            }

            System.out.println(result);
            result = "";
        }


//        for (int i = 1; i <=5 ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                result=result+j;
//            }
//            System.out.println(result);
//            result="";
//        }

    }
}

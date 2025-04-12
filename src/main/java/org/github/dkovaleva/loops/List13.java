package org.github.dkovaleva.loops;

public class List13 {
    public static void main(String[] args) {
        String result = "";
        int last;


        for (int i = 1; i <= 5; i++) {
            result = "";


            for (int k = i; k < 5; k++) {
                result = result + " ";
            }
            for (int n = 1; n <= i; n++) {
                result = result + n;

            }
//            last=1;

//            for (int k = last; k <=i ; k++) {
//                result=result+last;
//            }

            for (int j = i - 1; j >= 1; j--) {
                result = result + j;
            }

            System.out.println(result);
        }

    }
}

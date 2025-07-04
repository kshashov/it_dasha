package org.github.dkovaleva.repeat;

interface Anonymous {
    public void test();


    public class test {
        public static int doubles = 2;

        public static void main(String[] args) {
            //Anonymous anon =
            int g = new Anonymous() {
                @Override
                public void test() {
                    System.out.println("тест");
                }

                public int num(int num) {
                    return num * doubles;
                }
            }.num(56);

//            anon.test();
//            anon.num(1);

        }

    }

}

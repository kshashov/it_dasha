package org.github.dkovaleva;

public class ExceptionTest {

    public static void main(String[] args) {
        try {
            throwSome();
        } catch (IllegalArgumentException ex) {
            System.out.println("argument");
        } catch (Exception ex) {
            System.out.println(ex.getClass().getSimpleName());
        }
        System.out.println("test");
    }

    private static void throwSome() {
        throw new RuntimeException("");
    }


}



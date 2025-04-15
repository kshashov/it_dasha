package org.github.dkovaleva;

public class GamesAnddemons {


    public static void main(String[] args) {

        System.out.println(Color.RED.getCode());        // #FF0000
        System.out.println(Color.GREEN.getCode());      // #00FF00

        String text = "RED";

        Color color = Color.valueOf(text);
        draw(color);


    }

    public static void draw(Color color) {
        System.out.println("Нарисовал круг цветом " + color.getCode());
    }

}




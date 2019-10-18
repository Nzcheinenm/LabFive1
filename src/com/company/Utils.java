package com.company;

import static com.company.Color.ANSI_RESET;

public class Utils {

    public static void print(String text) {
        System.out.println( text );
    }
    public static void print(String text,Color color) {
        System.out.println( color.getColor() + text + ANSI_RESET.getColor() );
    }

    public static void printRandom(String text) {
        System.out.println(Color.getRandomColor() + text + ANSI_RESET.getColor());
    }


}

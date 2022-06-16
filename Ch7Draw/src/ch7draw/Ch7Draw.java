package ch7draw;

import java.util.Scanner;

public class Ch7Draw {

    public static void drawBar(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    public static void drawBox(int length, int height) {
        for (int i = 1; i <= height; i++) {
            drawBar(length);
        }
    }

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.println("Drawing Project by Kevin Bell\n");

        //draw a right triangle
        for (int i = 1; i <= 6; i++) {
            drawBar(i);
        }
        System.out.println();
        
        //draw a box
        drawBox(5, 4);
        System.out.println();
    }
}

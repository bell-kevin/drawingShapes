package ch7draw;

import java.util.Scanner;

public class Ch7Draw {

    public static void drawBar(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void drawBar(int length, String characterPreference) {
        for (int i = 1; i <= length; i++) {
            System.out.print(characterPreference);
        }
        System.out.println();
    }

    public static void drawBox(int length, int height) {
        for (int i = 1; i <= height; i++) {
            drawBar(length);
        }
    }

    public static void drawBox(int length, int height, String characterPreference) {
        for (int i = 1; i <= height; i++) {
            drawBar(length, characterPreference);
        }
    }

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.println("Drawing Project by Kevin Bell\n");
        int width, height;
        String yesOrNo, characterPreference, keepPlaying;
        System.out.print("Do you want me to draw a box? (Y or N) ");
        keepPlaying = computerKeyboardInput.next();
        while (keepPlaying.equalsIgnoreCase("y")) {
            System.out.print("How wide is the box? ");
            width = computerKeyboardInput.nextInt();
            System.out.print("How tall is the box? ");
            height = computerKeyboardInput.nextInt();
            System.out.print("Do you want the default marker (asterisk), Y or N? ");
            yesOrNo = computerKeyboardInput.next();
            if (yesOrNo.equalsIgnoreCase("n")) {
                System.out.print("What character do you want to use? ");
                characterPreference = computerKeyboardInput.next();
            } else {
                characterPreference = "*";
            }
            drawBox(width, height, characterPreference);
            System.out.println("");
            System.out.print("Do you want me to draw a box? (Y or N) ");
            keepPlaying = computerKeyboardInput.next();
        }
    }
}

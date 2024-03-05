package org.example.controll;


import java.util.Scanner;

public class Prompt {
    private static Scanner sc;

    private Prompt() {
        sc = new Scanner(System.in);
    }

    public static String prompt() {
        System.out.println("Please, enter your name, surname, lastname, date of birth (use dd.mm.yyyy format), phone number, male separated by a space: ");
        return sc.nextLine();
    }

    static {
        sc = new Scanner(System.in);
    }
}

package com.example.welcometojava;


import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Hi, what's your name? ");
        String name = scan.nextLine();

        System.out.println("Welcome to Java, " + name + " " + Suit.CLUBS);
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite savo varda");

        String Vardas = sc.nextLine();

        System.out.println(Vardas);

        for (int i = 0; i < 5; i++) {
            System.out.println(Vardas);

        }


    }
}

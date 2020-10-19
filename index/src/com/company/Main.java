package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] pole = {1, 5, 10, 15, 20, -1, -5, -10, 33, 99, 1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej číslo:");

        int cislo = sc.nextInt();
        int k = 0;
        int o = 1;
        int t = 0;

        for (int i = 0; i < pole.length; i++) {
            if (cislo == pole[i]) {
                if (1 != t) {
                    t++;
                    k++;
                    int a = i + 1;
                    System.out.println("První výskyt čísla " + cislo + " je na indexu " + i + "; tedy " + a + ". pozici.");
                }
            }
        }
        if (k != o) {
            System.out.println("Takovéto číslo není v seznamu čísel.");
        }
    }
}




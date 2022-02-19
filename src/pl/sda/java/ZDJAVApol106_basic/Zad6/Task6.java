package pl.sda.java.ZDJAVApol106_basic.Zad6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert multiplier: ");
        int multiplier = scanner.nextInt();
        System.out.println("Zakres: ");
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        printMultiplicationTable(multiplier,min,max);

    }

    private static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand) {
        for (; minMultiplicand <= maxMultiplicand; minMultiplicand++) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " x " + minMultiplicand + " = " + result);
        }
    }
}

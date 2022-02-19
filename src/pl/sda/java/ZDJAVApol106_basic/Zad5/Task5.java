package pl.sda.java.ZDJAVApol106_basic.Zad5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Plese insert first digit: ");
        int firstDigit = scanner.nextInt();
        System.out.print("Plese insert second digit: ");
        int secondDigit = scanner.nextInt();
        int sum = calcuateTheSumOfSequence(firstDigit, secondDigit);
        System.out.println("Sum is: " + sum);

    }

    private static int calcuateTheSumOfSequence (int firstDigit, int lastDigit ) {
        if(firstDigit>lastDigit) {
            int tmp = firstDigit;
            firstDigit = lastDigit;
            lastDigit = tmp;
        }

        int sum = 0;
        while (firstDigit <= lastDigit){
            sum +=firstDigit;
            firstDigit++;
        }
        return sum;
    }
}

package pl.sda.java.ZDJAVApol106_basic.Zad7;

import java.util.Scanner;

public class Task7 {
    //calculator asking for two digits and type of execution
    //w while zamieniamy warunek, zeby decision nigdy nie byl nullem

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        String decision;

        do {
            System.out.println("New calculation or \"Stop\"");

            decision = scanner.nextLine();
        } while (!("Stop".equalsIgnoreCase(decision)));
    }
    
}

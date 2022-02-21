package pl.sda.java.ZDJAVApol106_basic.brudnopis;

import java.util.Scanner;

public class Zada1 {
    public static void main(String[] args) {
        System.out.println(getLastLetter());
//        String s1 = "mama";
//        String s2 = "mama";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        String s3 = new String("mama");
//        System.out.println(s1 == s3);
//        System.out.println(s1.equals(s3));

    }

    private static char getLastLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String userWord = scanner.nextLine();
        if (userWord == null && userWord.isBlank()) {
            System.out.println("WROOOOOOONGGGG");
            System.exit(-1);

        }
        userWord = userWord.trim();
        char lastLetter = userWord.charAt(userWord.length() - 1);
        return lastLetter;

    }
}

package pl.sda.java.ZDJAVApol106_basic;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert first digit: ");
        int first = scanner.nextInt();
        System.out.println("Please insert second digit: ");
        int second = scanner.nextInt();
        boolean greater = isGreaterThan(first,second);
        System.out.println("If x is grater than y: " + greater );
        boolean greater2 = isTrippledBigger(first,second);
        System.out.println("If x * 3 is grater than y: " + greater2 );
        boolean greater3 = taskC(first,second);
        System.out.println("If y++ is smaller than ++x and --x is smaller than y++: " + greater3 );
        boolean greater4 = isEven(first,second);
        System.out.println("If x * y is even: " + greater4 );


    }

    private static boolean isGreaterThan(int x, int y) {
        return x > y;
    }

    private static boolean isTrippledBigger(int x, int y) {
        return x*3 > y;
    }

    private static boolean taskC (int x, int y) {
        return (y++ < ++x) && (--x < y++);
    }

    private static boolean isEven (int x, int y) {
        return (x*y) %2 ==0;
    }
}

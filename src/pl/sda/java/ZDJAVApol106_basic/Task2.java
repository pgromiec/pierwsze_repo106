package pl.sda.java.ZDJAVApol106_basic;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        float diameter = getDiameterFromUser();

        float circumference = calculateCircumferenceOfACircle(diameter);
        System.out.println("Circumference Of A Circle: " + circumference);

        float area = calculateAreaOfACircle(diameter);
        System.out.println("Area Of A Circle: " + area);
    }


    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the diameter and pres ENTER");
        return scanner.nextFloat();
    }

    private static float calculateCircumferenceOfACircle(float diameter) {
        // 2 * pi * r -> pi * d
        //return PI * diameter;
        return (float) Math.PI * diameter;
    }

    private static float calculateAreaOfACircle(float diameter) {
        // pi * r ^ 2
        float radius = diameter / 2;
        return (float) Math.PI * radius * radius;
    }
}

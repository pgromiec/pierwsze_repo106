package pl.sda.java.ZDJAVApol106_basic.Zad4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {

    private static Scanner scanner = new Scanner(System.in);
    private static final float BMI_MIN_RANGE = 18.5f;
    private static final float BMI_MAX_RANGE = 24.9f;


    //BMI program
    public static void main(String[] args) {
        float weightFromUser = getWeightFromUser();
        int heightFromUser = getHeightFromUser();
        float bmi = calculateBMI(weightFromUser, heightFromUser);
        displayBmiResult(bmi);

    }

    private static int getHeightFromUser() {
        System.out.println("Please insert weight in kg: ");
        int height = 0;
        try {
            return height = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Plese insert only digits! ");
        }
        return height;
    }

    private static float getWeightFromUser() {
        System.out.println("Please insert height in cm : ");
        float weight = 0;
        try {
            weight = scanner.nextFloat();
        } catch (InputMismatchException exception) {
            System.out.println("Plese insert only integer digits! ");
        }
        return weight;
    }

    private static float calculateBMI(float weight, float height) {
        float heightInMeter = height / 100f;
        return weight / (heightInMeter * heightInMeter);
    }

    private static void displayBmiResult(float bmi) {
        if (bmi < BMI_MIN_RANGE || bmi > BMI_MAX_RANGE) {
            System.out.println("BMI is incorrect: " + bmi);
        } else {
            System.out.println("BMI is correct: " + bmi);
        }
    }
}


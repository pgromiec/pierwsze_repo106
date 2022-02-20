package pl.sda.java.ZDJAVApol106_basic.Zad10;

public class Task10 {
    //program który pobierze od użytkownika liczbę całkowitą int, a następnie obliczy sumę cyfr podanej liczby

    public static void main(String[] args) {

        System.out.println(sumOfNumbers(40));

    }

    private static int sumOfNumbers(int number) {
        int sum = 0;
        if(number > 9) {
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
        }else {
            sum = number;
        }
        return sum;
    }

}

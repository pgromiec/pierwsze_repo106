package pl.sda.java.ZDJAVApol106_basic.Day2.Task5;

public class Task5 {
    public static void main(String[] args) {
        String input = "Ala ma kota.";
        char character = 'a';
        System.out.println(howManyLettersInSentence(input, character));
    }

    private static int howManyLettersInSentence(String mySentence, char letter) {
        if (mySentence != null && !mySentence.isBlank()) {
            int sumOfLetters = 0;
            for (int i = 0; i < mySentence.length(); i++) {
                if (mySentence.charAt(i) == letter) {
                    sumOfLetters++;
                }
            }
            return sumOfLetters;
        }
        return 0;
    }
}


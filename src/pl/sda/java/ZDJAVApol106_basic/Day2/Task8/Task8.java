package pl.sda.java.ZDJAVApol106_basic.Day2.Task8;

public class Task8 {
    public static void main(String[] args) {
        String input = "AlaKot";
        System.out.println("Input: " + input);
        System.out.println("Result: " + replaceChars(input));
    }
    private static String replaceChars(String input) {
        //32 roznica w kodzie ascii pomiedzy mala a duza litera
        String result ="";
        for(int i =0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(currentChar >= 65 && currentChar <= 90) {
                result += (char)(currentChar + 32);
            } else if (currentChar >=97 && currentChar <=122) {
                result += (char)(currentChar - 32);
            } else {
                result += currentChar;
            }
        }
        return result;

    }

}

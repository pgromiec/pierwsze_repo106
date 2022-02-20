package pl.sda.java.ZDJAVApol106_basic.Day2.Task3;

public class Task3 {
    public static void main(String[] args) {
        String mySentence = "";
        String myWord = "";
        System.out.println(getIndex(mySentence,myWord));

    }

    private static int getIndex (String input, String word) {
        if(input != null && word != null && !input.isBlank() && !word.isEmpty()) {
            return input.contains(word) ? input.indexOf(word) : -1;
        }
        return -1;
    }
}

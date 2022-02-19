package pl.sda.java.ZDJAVApol106_basic;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Jestem Janek!");
        displayWordUsingDecimalFormat();
        System.out.println();
        dispayWordUsingHex();
    }

    private static void displayWordUsingDecimalFormat(){
        char s = 83;
        char d = 68;
        char a = 65;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }

    private static void dispayWordUsingHex(){
        char s = 0x53;
        char d = 0x44;
        char a = 0x41;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);

    }
}

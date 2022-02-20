package pl.sda.java.ZDJAVApol106_basic.Day2.Task4;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(replacingWords("Ale ma, kota.I kot chce, do mamy. Dzieuje, zosia. "));

    }

    private static String replacingWords(String input) {
        if(input !=null) {
            return input
                    .replace(".", "-STOP_")
                    .replace(", ", "-STOP-");
        }
        return input;
    }
}

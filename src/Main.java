import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do " +
            "eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam," +
            " quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat " +
            "nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia " +
            "deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordsChecker wordsCh = new WordsChecker(text);
        System.out.println(text);
        while (true) {
            System.out.println("Введите слово.");
            String in = scanner.nextLine();
            if (in.equals(text)) {
                System.out.println(text);
                continue;
            }
            System.out.println(wordsCh.hasWord(in) ? "Слово есть в тексте :)" : "Слова нет в тексте :(");
        }
    }
}
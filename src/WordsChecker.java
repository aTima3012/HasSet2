import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected Set<String> wordsSet = new HashSet<>();

    public WordsChecker(String text) {
        String[] words = text.split("\\P{IsAlphabetic}+");
        for (String word : words) {
            wordsSet.add(word);
        }
    }

    public boolean hasWord(String word) {
        return wordsSet.contains(word);
    }
}


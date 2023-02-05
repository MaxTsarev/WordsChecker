import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] strings = text.split("\\P{IsAlphabetic}+");
        Set<String> set = new HashSet<>();
        Collections.addAll(set, strings);
        if (set.contains(word)) {
            return true;
        }
        return false;
    }
}

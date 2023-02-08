import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private String text;
    private Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
        String[] strings = text.split("\\P{IsAlphabetic}+");
        Collections.addAll(set, strings);
    }

    public boolean hasWord(String word) {
        if (set.contains(word)) {
            return true;
        }
        return false;
    }
}

package Collections;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public static void main(String[] args) {
        String testSentence = "Use a HashMap to count word frequencies in a sentence. Use a HashMap to count word frequencies in a sentence. Use a HashMap to count word frequencies in a sentence.";
        String[] wordArray = testSentence.split(" ");
        Map<String, Integer> words = new HashMap<>();
        for (String word : wordArray) {
            words.putIfAbsent(word, 1);
            words.computeIfPresent(word, (k, v) -> v + 1);
        }

        words.forEach((k, v) -> System.out.println(k + ": " + v));
    }




}

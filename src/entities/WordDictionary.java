package entities;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordDictionary {
    private Map<Character, Set<String>> dictionary;

    public WordDictionary() {
        dictionary = new HashMap<>();
    }

    public boolean addWord(String word) {
        String sanitizedWord = sanitizeWord(word);
        char initial = sanitizedWord.charAt(0);

        if (!dictionary.containsKey(initial)) {
            dictionary.put(initial, new HashSet<>());
        }

        Set<String> words = dictionary.get(initial);
        if (words.contains(sanitizedWord)) {
            return false;
        }

        words.add(sanitizedWord);
        return true;
    }

    public boolean removeWord(String word) {
        String sanitizedWord = sanitizeWord(word);
        char initial = sanitizedWord.charAt(0);

        if (!dictionary.containsKey(initial)) {
            return false;
        }

        Set<String> words = dictionary.get(initial);
        if (!words.contains(sanitizedWord)) {
            return false;
        }

        words.remove(sanitizedWord);
        if (words.isEmpty()) {
            dictionary.remove(initial);
        }

        return true;
    }

    public boolean containsWord(String word) {
        String sanitizedWord = sanitizeWord(word);
        char initial = sanitizedWord.charAt(0);

        if (!dictionary.containsKey(initial)) {
            return false;
        }

        Set<String> words = dictionary.get(initial);
        return words.contains(sanitizedWord);
    }

    public Set<Character> getAvailableInitials() {
        return dictionary.keySet();
    }

    public Set<String> getWordsByInitial(char initial) {
        if (!dictionary.containsKey(initial)) {
            return new HashSet<>();
        }

        return dictionary.get(initial);
    }

    private String sanitizeWord(String word) {
        return word.trim().toLowerCase();
    }
}
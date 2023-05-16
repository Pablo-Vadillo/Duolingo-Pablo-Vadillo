package utilities;

import entities.WordDictionary;

import java.util.Scanner;
import java.util.Set;

public class Menu {
    private static final int ADD_WORD_OPTION = 1;
    private static final int REMOVE_WORD_OPTION = 2;
    private static final int CONTAINS_WORD_OPTION = 3;
    private static final int SHOW_AVAILABLE_INITIALS_OPTION = 4;
    private static final int SHOW_WORDS_BY_INITIAL_OPTION = 5;
    private static final int EXIT_OPTION = 6;

    private Scanner scanner;
    private WordDictionary wordDictionary;

    public Menu() {
        scanner = new Scanner(System.in);
        wordDictionary = new WordDictionary();
    }

    public void showWelcomeMessage() {
        System.out.println("Welcome to the Word Dictionary Program of Duolingo by Vadillo!");
    }

    public void showMenu() {
        System.out.println("\nPlease select an option:");
        System.out.println("1. Add word");
        System.out.println("2. Remove word");
        System.out.println("3. Check if word exists");
        System.out.println("4. Show available initials");
        System.out.println("5. Show words by initial");
        System.out.println("6. Exit");
    }

    public void processOption(int option) {
        switch (option) {
            case ADD_WORD_OPTION:
                addWord();
                break;
            case REMOVE_WORD_OPTION:
                removeWord();
                break;
            case CONTAINS_WORD_OPTION:
                containsWord();
                break;
            case SHOW_AVAILABLE_INITIALS_OPTION:
                showAvailableInitials();
                break;
            case SHOW_WORDS_BY_INITIAL_OPTION:
                showWordsByInitial();
                break;
            case EXIT_OPTION:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private void addWord() {
        System.out.println("Enter a word to add:");
        String word = scanner.nextLine();

        if (wordDictionary.addWord(word)) {
            System.out.println("Word added successfully.");
        } else {
            System.out.println("Word already exists.");
        }
    }

    private void removeWord() {
        System.out.println("Enter a word to remove:");
        String word = scanner.nextLine();

        if (wordDictionary.removeWord(word)) {
            System.out.println("Word removed successfully.");
        } else {
            System.out.println("Word not found.");
        }
    }

    private void containsWord() {
        System.out.println("Enter a word to check:");
        String word = scanner.nextLine();

        if (wordDictionary.containsWord(word)) {
            System.out.println("Word found.");
        } else {
            System.out.println("Word not found.");
        }
    }

    private void showAvailableInitials() {
        Set<Character> initials = wordDictionary.getAvailableInitials();

        if (initials.isEmpty()) {
            System.out.println("No words available.");
        } else {
            System.out.println("Available initials: " + initials);
        }
    }

    private void showWordsByInitial() {
        System.out.println("Enter an initial:");
        String input = scanner.nextLine();
        char initial = input.charAt(0);

        Set<String> words = wordDictionary.getWordsByInitial(initial);

        if (words.isEmpty()) {
            System.out.println("No words found for initial " + initial);
        } else {
            System.out.println("Words for initial " + initial + ": " + words);
        }
    }
}
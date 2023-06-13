package ui;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import calculation.Calculation;
import enums.Champion;

public class MainUserInterface {
    private static final int VALID_SIZE = 7;
    private static final String COLORS = "Type the colors you see from your " +
            "guess (g for green, o for orange, r for red). For release year, " +
            "if the box is red, type u for up or d for down.";
    private static final String COMMA = ",";
    private static final String EXIT = "exit";
    private static final String EXIT_MSG = "Exit program whenever by typing " +
            "\"exit\"";
    private static final String NEXT_GUESS = "Try this as your next guess: %s";
    private static final String NOT_VALID_INPUT = "That was not a valid " +
            "input, please try again.";
    private static final String WELCOME_STRING = "Welcome to LOLdle Solver! " +
            "\nTry this as your first guess: %s";
    private static final List<String> VALID_INPUT = Arrays.asList(
            "g", "o", "r", "u", "d");

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Scanner scanner = new Scanner(System.in);

        // welcome user
        List<Champion> championList = Arrays.asList(Champion.values());
        String firstGuess = calculation.calculateFirstGuess(championList);
        System.out.println(String.format(WELCOME_STRING, firstGuess));
        System.out.println(EXIT_MSG);

        // loop till exited
        String guess = firstGuess;
        boolean exit = false;
        while (!exit) {
            System.out.println(COLORS);
            String userInput = scanner.nextLine();
            userInput = userInput.toLowerCase();

            // validate user input
            boolean validInput = validateInput(userInput);
            if (!validInput) {
                if (userInput.equalsIgnoreCase(EXIT)) {
                    exit = true;
                } else {
                    System.out.println(NOT_VALID_INPUT);
                }
                continue;
            }

            // find next guess
            guess = calculation.calculateNextBestGuess(guess, userInput);
            System.out.println(String.format(NEXT_GUESS, guess));
        }

        scanner.close();
    }

    /**
     * Validate user input for guess.
     * 
     * @param userInput user input
     * @return true if valid, false otherwise
     */
    private static boolean validateInput(String userInput) {
        boolean valid = true;

        try {
            String[] input = userInput.split(COMMA);
            for (String color : input) {
                if (!VALID_INPUT.contains(color)) {
                    valid = false;
                    break;
                }
            }
            if (VALID_SIZE != input.length) {
                valid = false;
            }
        } catch (Exception e) {
            valid = false;
        }

        return valid;
    }

}
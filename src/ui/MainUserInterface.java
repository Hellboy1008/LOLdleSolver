package ui;

import java.util.Scanner;

import calculation.Calculation;

public class MainUserInterface {
    private static final String WELCOME_STRING = "Welcome to LOLdle Solver! " +
            "Try this as your first guess: %s";

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Scanner scanner = new Scanner(System.in);

        // welcome user
        System.out.println(String.format(WELCOME_STRING,
                calculation.calculateFirstGuess().getChampionName()));

        scanner.close();
    }
}
package calculation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import constants.ChampionConstants;
import enums.Champion;

public class Calculation {

    /**
     * Calculate the first champion the user should guess.
     * 
     * @return the best champion to guess in the 1st round
     */
    public Champion calculateFirstGuess() {
        List<Champion> championList = Arrays.asList(Champion.values());
        Champion bestGuess = Champion.AATROX;
        int lowestRemaining = Integer.MAX_VALUE;
        for (Champion guess : championList) {
            int remaining = 0;
            for (Champion answer : championList) {
                if (guess == answer) {
                    continue;
                }
                remaining += getRemaining(guess, answer);
            }
            if (remaining < lowestRemaining) {
                lowestRemaining = remaining;
                bestGuess = guess;
            }
        }

        return bestGuess;
    }

    /**
     * Get the remaining number of champions left given the guess and answer.
     * 
     * @param guess  the champion being guessed
     * @param answer the champion that is the answer
     * @return the number of remaining champions after guess
     */
    private int getRemaining(Champion guess, Champion answer) {
        List<Champion> championList = new ArrayList<>();
        championList.addAll(Arrays.asList(Champion.values()));
        championList.remove(guess);

        // filter by categories
        championList = filterSingle(guess.getGender(), answer.getGender(),
                championList, ChampionConstants.GENDER);
        championList = filterSet(guess.getPositions(), answer.getPositions(),
                championList, ChampionConstants.POSITION);
        championList = filterSet(guess.getSpecies(), answer.getSpecies(),
                championList, ChampionConstants.SPECIES);
        championList = filterSingle(guess.getResource(), answer.getResource(),
                championList, ChampionConstants.RESOURCE);
        championList = filterSet(guess.getRangeType(), answer.getRangeType(),
                championList, ChampionConstants.RANGE_TYPE);
        championList = filterSet(guess.getRegions(), answer.getRegions(),
                championList, ChampionConstants.REGION);
        championList = filterByYear(guess.getReleaseYear(),
                answer.getReleaseYear(), championList);

        return championList.size();
    }

    /**
     * Filter a list of champions based on a non-Set singular category.
     * 
     * @param guess        the guess object
     * @param answer       corresponding answer object
     * @param championList champion list to be filtered
     * @param category     category being filtered against
     * @return List filtered by category
     */
    private List<Champion> filterSingle(Object guess, Object answer,
            List<Champion> championList, String category) {
        if (guess.equals(answer)) {
            // if object is the same, just filter by object of guess
            return championList.stream().filter(
                    c -> guess.equals(c.getCategory(category))).toList();
        }
        // if object is different, filter against the object of guess
        return championList.stream().filter(
                c -> !guess.equals(c.getCategory(category))).toList();
    }

    /**
     * Filter a list of champions based on a Set category.
     * 
     * @param guess        the guess Set
     * @param answer       the answer Set
     * @param championList champion list to be filtered
     * @param category     category being filtered against
     * @return List filtered by category
     */
    @SuppressWarnings("unchecked")
    private List<Champion> filterSet(Object guess, Object answer,
            List<Champion> championList, String category) {
        Set<Object> guessSet = (Set<Object>) guess;
        Set<Object> answerSet = (Set<Object>) answer;

        if (guess.equals(answer)) {
            // if sets are the same, filter by set
            return championList.stream().filter(
                    c -> guess.equals(c.getCategory(category))).toList();
        } else if (!Collections.disjoint(guessSet, answerSet)) {
            // if sets are common, filter by guess set
            return championList.stream().filter(c -> !Collections.disjoint(
                    (Set<Object>) c.getCategory(category), guessSet)).toList();
        }
        // if positions are not common, filter against guess position(s)
        return championList.stream().filter(c -> Collections.disjoint(
                (Set<Object>) c.getCategory(category), guessSet)).toList();
    }

    /**
     * Filter a list of champions based on release year.
     * 
     * @param guess        the release year of guess champion
     * @param answer       the release year of answer champion
     * @param championList champion list to be filtered
     * @return List filtered by release year
     */
    private List<Champion> filterByYear(int guessYear, int answerYear,
            List<Champion> championList) {
        if (guessYear == answerYear) {
            return championList.stream().filter(
                    c -> guessYear == c.getReleaseYear()).toList();
        } else if (guessYear < answerYear) {
            return championList.stream().filter(
                    c -> guessYear < c.getReleaseYear()).toList();
        }
        return championList.stream().filter(
                c -> guessYear > c.getReleaseYear()).toList();
    }
}
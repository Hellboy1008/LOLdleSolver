package calculation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import constants.ChampionConstants;
import enums.Champion;

public class Calculation {

	private static final String ANSWER = " (which is also the answer)";
	private static final String DELIMITER = ",";
	private static final String GREEN = "g";
	private static final String ORANGE = "o";
	private static final String UP = "u";
	private static final Set<?> EMPTY_SET = Collections.emptySet();

	/**
	 * Calculate the first champion the user should guess.
	 * 
	 * @param championList champion list to start with
	 * @return the name of the best champion to guess in the 1st round
	 */
	public String calculateFirstGuess(List<Champion> championList) {
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

		return bestGuess.getChampionName();
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
				championList, ChampionConstants.GENDER, null);
		championList = filterSet(guess.getPositions(), answer.getPositions(),
				championList, ChampionConstants.POSITION, null);
		championList = filterSet(guess.getSpecies(), answer.getSpecies(),
				championList, ChampionConstants.SPECIES, null);
		championList = filterSingle(guess.getResource(), answer.getResource(),
				championList, ChampionConstants.RESOURCE, null);
		championList = filterSet(guess.getRangeType(), answer.getRangeType(),
				championList, ChampionConstants.RANGE_TYPE, null);
		championList = filterSet(guess.getRegions(), answer.getRegions(),
				championList, ChampionConstants.REGION, null);
		championList = filterByYear(guess.getReleaseYear(),
				answer.getReleaseYear(), championList, null);

		return championList.size();
	}

	/**
	 * Filter a list of champions based on a non-Set singular category.
	 * 
	 * @param guess        the guess object
	 * @param answer       corresponding answer object
	 * @param championList champion list to be filtered
	 * @param category     category being filtered against
	 * @param color        color denoting which flow to execute, optional
	 * @return List filtered by category
	 */
	private List<Champion> filterSingle(Object guess, Object answer,
			List<Champion> championList, String category, String color) {
		if (GREEN.equals(color) || guess.equals(answer)) {
			// if object is the same, just filter by object of guess
			return championList.stream()
					.filter(c -> guess.equals(c.getCategory(category)))
					.toList();
		}
		// if object is different, filter against the object of guess
		return championList.stream()
				.filter(c -> !guess.equals(c.getCategory(category))).toList();
	}

	/**
	 * Filter a list of champions based on a Set category.
	 * 
	 * @param guess        the guess Set
	 * @param answer       the answer Set
	 * @param championList champion list to be filtered
	 * @param category     category being filtered against
	 * @param color        color denoting which flow to execute, optional
	 * @return List filtered by category
	 */
	@SuppressWarnings("unchecked")
	private List<Champion> filterSet(Object guess, Object answer,
			List<Champion> championList, String category, String color) {
		Set<Object> guessSet = (Set<Object>) guess;
		Set<Object> answerSet = (Set<Object>) answer;

		if (GREEN.equals(color) || guess.equals(answer)) {
			// if sets are the same, filter by set
			return championList.stream()
					.filter(c -> guess.equals(c.getCategory(category)))
					.toList();
		} else if (ORANGE.equals(color)
				|| !Collections.disjoint(guessSet, answerSet)) {
			// if sets are common, filter by guess set
			return championList.stream()
					.filter(c -> !Collections.disjoint(
							(Set<Object>) c.getCategory(category), guessSet))
					.toList();
		}
		// if positions are not common, filter against guess position(s)
		return championList.stream()
				.filter(c -> Collections.disjoint(
						(Set<Object>) c.getCategory(category), guessSet))
				.toList();
	}

	/**
	 * Filter a list of champions based on release year.
	 * 
	 * @param guess        the release year of guess champion
	 * @param answer       the release year of answer champion
	 * @param championList champion list to be filtered
	 * @param color        color denoting which flow to execute, optional
	 * @return List filtered by release year
	 */
	private List<Champion> filterByYear(int guessYear, int answerYear,
			List<Champion> championList, String color) {
		if (GREEN.equals(color) || guessYear == answerYear) {
			return championList.stream()
					.filter(c -> guessYear == c.getReleaseYear()).toList();
		} else if (UP.equals(color) || guessYear < answerYear) {
			return championList.stream()
					.filter(c -> guessYear < c.getReleaseYear()).toList();
		}
		return championList.stream().filter(c -> guessYear > c.getReleaseYear())
				.toList();
	}

	/**
	 * Calculate next best guess based on user input.
	 * 
	 * @param guess           user's guess
	 * @param userInput       user input based on previous guess
	 * @param previousGuesses previous guesses the user has already made
	 * @return champion name of next best guess
	 */
	public String calculateNextBestGuess(String guess, String userInput,
			List<String> previousGuesses) {
		Champion guessChampion = Champion.getChampionFromName(guess);
		List<Champion> championList = Arrays.asList(Champion.values());
		String[] userInputArr = userInput.split(DELIMITER);

		// filter out previous guesses
		for (String champion : previousGuesses) {
			championList = championList.stream().filter(
					c -> !champion.equalsIgnoreCase(c.getChampionName()))
					.toList();
		}

		// filter by categories
		championList = filterSingle(guessChampion.getGender(), null,
				championList, ChampionConstants.GENDER, userInputArr[0]);
		championList = filterSet(guessChampion.getPositions(), EMPTY_SET,
				championList, ChampionConstants.POSITION, userInputArr[1]);
		championList = filterSet(guessChampion.getSpecies(), EMPTY_SET,
				championList, ChampionConstants.SPECIES, userInputArr[2]);
		championList = filterSingle(guessChampion.getResource(), null,
				championList, ChampionConstants.RESOURCE, userInputArr[3]);
		championList = filterSet(guessChampion.getRangeType(), EMPTY_SET,
				championList, ChampionConstants.RANGE_TYPE, userInputArr[4]);
		championList = filterSet(guessChampion.getRegions(), EMPTY_SET,
				championList, ChampionConstants.REGION, userInputArr[5]);
		championList = filterByYear(guessChampion.getReleaseYear(), -1,
				championList, userInputArr[6]);

		if (championList.size() == 1) {
			return championList.get(0).getChampionName() + ANSWER;
		}

		return calculateFirstGuess(championList);
	}
}
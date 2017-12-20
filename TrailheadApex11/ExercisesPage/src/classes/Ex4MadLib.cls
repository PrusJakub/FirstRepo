/**
 * Created by Kuba on 29.11.2017.
 */

public with sharing class Ex4MadLib implements ExercisesLoader {
    public String solveTheExercise(List<String> input) {
        List<String> validatedList = ExercisesController.deleteBlankChars(input);
        if (validatedList.size() < 4) {
            throw new ExerciseException(UtilConstants.emptyInputOrTooShortInput);
        }
        String noun = validatedList.get(0);
        String verb = validatedList.get(1);
        String adjective = validatedList.get(2);
        String adverb = validatedList.get(3);

        return 'Enter a noun: ' + noun
                + '\nEnter a verb: ' + verb
                + '\nEnter an adjective: ' + adjective
                + '\nEnter an adverb: ' + adverb
                + '\nDo you ' + verb + ' your ' + adjective + ' ' + noun + ' ' + adverb;
    }
}
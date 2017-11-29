/**
 * Created by Kuba on 29.11.2017.
 */

public with sharing class Ex4MadLib implements ExercisesLoader {
    public String solveTheExercise(List<String> input) {
        try {
            String noun = ExercisesController.isInputEmpty(input).get(0);
            String verb = ExercisesController.isInputEmpty(input).get(1);
            String adjective = ExercisesController.isInputEmpty(input).get(2);
            String adverb = ExercisesController.isInputEmpty(input).get(3);
            if (noun == null) {
                return 'You have to type text to be solved';
            } else {
                return 'Enter a noun: ' + noun + '\nEnter a verb: ' + verb + '\nEnter an adjective: ' + adjective + '\nEnter an adverb: ' + adverb +
                        '\nDo you ' + verb + ' your ' + adjective + ' ' + noun + ' ' + adverb;
            }
        } catch (Exception e) {
            return 'You have to type text to be solved or you didn\'t type required lines of text ';
        }
    }

}
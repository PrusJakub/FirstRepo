/**
 * Created by Kuba on 29.11.2017.
 */

public with sharing class Ex3PrintingQuotes implements ExercisesLoader {
    public String solveTheExercise(List<String> input) {
        try {
            String quote = ExercisesController.isInputEmpty(input).get(0);
            String saidBy = ExercisesController.isInputEmpty(input).get(1);
            if (quote == null) {
                return 'You have to type text to be solved';
            } else {
                return 'What is the quote? ' + quote + '\nWho said it? ' + saidBy + '\n' + saidBy + ' says "' + quote + '"';
            }
        } catch (Exception e) {
            return 'You have to type text to be solved';
        }
    }
}
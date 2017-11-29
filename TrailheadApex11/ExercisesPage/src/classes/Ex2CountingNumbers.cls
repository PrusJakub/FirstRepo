/**
 * Created by Kuba on 29.11.2017.
 */

public with sharing class Ex2CountingNumbers implements ExercisesLoader {
    public String solveTheExercise(List<String> input) {
        try {
            String inputString = ExercisesController.isInputEmpty(input).get(0);
            if (inputString == null) {
                return 'You have to type text to be solved';
            } else {
                return inputString + ' has ' + inputString.length() + ' characters';
            }
        } catch (Exception e) {
            return 'You have to type text to be solved';
        }

    }
}
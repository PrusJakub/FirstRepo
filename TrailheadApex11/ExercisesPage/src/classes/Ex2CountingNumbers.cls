/**
 * Created by Kuba on 29.11.2017.
 */

public with sharing class Ex2CountingNumbers implements ExercisesLoader {
    public String solveTheExercise(List<String> input) {
        String inputString = ExercisesController.deleteBlankChars(input).get(0);
        return inputString + ' has ' + inputString.length() + ' characters';
    }
}
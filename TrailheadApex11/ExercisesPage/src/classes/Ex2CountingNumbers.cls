/**
 * Created by Kuba on 29.11.2017.
 */

public with sharing class Ex2CountingNumbers implements ExercisesLoader {
    public String solveTheExercise(List<String> input) {
        try {
            String st = ExercisesController.isInputEmpty(input).get(0);
            if (st == null) {
                return 'You have to type text to be solved';
            } else {
                return st + ' has ' + st.length() + ' characters';
            }
        } catch (Exception e) {
            return 'You have to type text to be solved';
        }

    }
}
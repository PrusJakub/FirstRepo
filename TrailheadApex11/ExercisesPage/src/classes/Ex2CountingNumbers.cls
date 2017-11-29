/**
 * Created by Kuba on 29.11.2017.
 */

public with sharing class Ex2CountingNumbers implements ExercisesLoader {
    public String solveTheExercise(List<String> input) {
        String st = ExercisesController.isInputEmpty(input);
        if (st == null) {
            return 'You have to type text to be solved';
        } else {

            return st + ' has ' + st.length() + ' characters';
        }


    }
}
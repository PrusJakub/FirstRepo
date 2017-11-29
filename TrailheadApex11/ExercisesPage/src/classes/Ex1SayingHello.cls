/**
 * Created by Kuba on 29.11.2017.
 */

public with sharing class Ex1SayingHello implements ExercisesLoader {
    public String solveTheExercise(List<String> input) {
        try {
            String inputString = ExercisesController.isInputEmpty(input).get(0);
            if (input == null) {
                return 'You have to type text to be solved';
            } else {
                return 'What is your name? ' + inputString + '\nHello, ' + inputString + ', nice to meet you!';
            }
        } catch (Exception e) {
            return 'You have to type text to be solved';
        }
    }
}
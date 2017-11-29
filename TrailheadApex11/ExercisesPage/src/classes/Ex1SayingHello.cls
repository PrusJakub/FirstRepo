/**
 * Created by Kuba on 29.11.2017.
 */

public with sharing class Ex1SayingHello implements ExercisesLoader {
    public String solveTheExercise(List<String> input) {
        try {
            String st = ExercisesController.isInputEmpty(input).get(0);
            if (st == null) {
                return 'You have to type text to be solved';
            } else {
                return 'What is your name? ' + st + '\nHello, ' + st + ', nice to meet you!';
            }
        } catch (Exception e) {
            return 'You have to type text to be solved';
        }
    }
}
/**
 * Created by Kuba on 29.11.2017.
 */

public with sharing class Ex1SayingHello implements ExercisesLoader {
    public String solveTheExercise(List<String> input) {
        boolean isInputEmpty = false;

        for (String st : input) {
            if (st == '' || st == ('\n')) {
                isInputEmpty = true;
            } else {
                String outputString = 'What is your name? ' + st + '\nHello, ' + st + ', nice to meet you!';
                return outputString;
            }
        }

        if (isInputEmpty) {
            String outputString = 'You have to type text to be solved';
            return outputString;
        } else return 'You have to type text to be solved';
        
    }
}
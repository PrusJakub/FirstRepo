/**
 * Created by Kuba on 29.11.2017.
 */

public with sharing class Ex5SimpleMath implements ExercisesLoader {
    public String solveTheExercise(List<String> input) {
        try {
            String firstNumber = ExercisesController.isInputEmpty(input).get(0);
            String secondNumber = ExercisesController.isInputEmpty(input).get(1);
            Integer firstNumberInteger = Integer.valueOf(firstNumber);
            Integer secondNumberInteger = Integer.valueOf(secondNumber);

            if (firstNumber == null) {
                return 'You have to type text to be solved';
            } else {
                return 'What is the first number? ' + firstNumber + '\nWhat is the second number? ' + secondNumber
                        + '\n' + firstNumber + '+' + secondNumber + '=' + (firstNumberInteger + secondNumberInteger)
                        + '\n' + firstNumber + '-' + secondNumber + '=' + (firstNumberInteger - secondNumberInteger)
                        + '\n' + firstNumber + '*' + secondNumber + '=' + (firstNumberInteger * secondNumberInteger)
                        + '\n' + firstNumber + '/' + secondNumber + '=' + (firstNumberInteger / secondNumberInteger);
            }
        } catch (Exception e) {
            return 'You have to type text to be solved or you didn\'t type required lines of text or didn\'t typed numbers';
        }
    }
}
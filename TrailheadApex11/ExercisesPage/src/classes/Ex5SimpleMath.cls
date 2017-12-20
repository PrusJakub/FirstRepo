/**
 * Created by Kuba on 29.11.2017.
 */

public with sharing class Ex5SimpleMath implements ExercisesLoader {
    public String solveTheExercise(List<String> input) {
        List<String> validatedList = ExercisesController.deleteBlankChars(input);
        if (validatedList.size() < 2) {
            throw new ExerciseException(UtilConstants.emptyInputOrTooShortInput);
        }
        String firstNumber = validatedList.get(0);
        String secondNumber = validatedList.get(1);
        Integer firstNumberInteger = Integer.valueOf(firstNumber);
        Integer secondNumberInteger = Integer.valueOf(secondNumber);

        return 'What is the first number? ' + firstNumber + '\nWhat is the second number? ' + secondNumber
                + '\n' + firstNumber + '+' + secondNumber + '=' + (firstNumberInteger + secondNumberInteger)
                + '\n' + firstNumber + '-' + secondNumber + '=' + (firstNumberInteger - secondNumberInteger)
                + '\n' + firstNumber + '*' + secondNumber + '=' + (firstNumberInteger * secondNumberInteger)
                + '\n' + firstNumber + '/' + secondNumber + '=' + (firstNumberInteger / secondNumberInteger);

    }
}
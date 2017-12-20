public with sharing class Ex1SayingHello implements ExercisesLoader {

    public String solveTheExercise(List<String> input) {
        String inputString = ExercisesController.deleteBlankChars(input).get(0);
        return 'What is your name? ' + inputString + '\nHello, ' + inputString + ', nice to meet you!';
    }
}
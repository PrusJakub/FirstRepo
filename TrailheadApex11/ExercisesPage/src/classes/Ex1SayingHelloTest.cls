@isTest
public with sharing class Ex1SayingHelloTest {

    @isTest static void solveTheExerciseTest() {
        ExercisesLoader exercisesLoader = new Ex1SayingHello();
        List<String> testList = new List<String>();
        String maciej = 'Maciej';
        testList.add(maciej);
        String output = exercisesLoader.solveTheExercise(testList);
        String expected = 'What is your name? Maciej\nHello, Maciej, nice to meet you!';
        System.assertEquals(expected, output);
    }
}
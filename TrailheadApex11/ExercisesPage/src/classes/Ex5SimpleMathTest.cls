/**
 * Created by Kuba on 06.12.2017.
 */
@isTest
public with sharing class Ex5SimpleMathTest {
    @isTest static void solveTheExerciseTest() {
        ExercisesLoader exercisesLoader = new Ex5SimpleMath();
        List<String> testList = new List<String>();
        String maciej = '4';
        String andrzej = '2';
        testList.add(maciej);
        testList.add(andrzej);
        String output = exercisesLoader.solveTheExercise(testList);
        String expectedText = 'What is the first number? 4' +
                '\nWhat is the second number? 2' +
                '\n4+2=6' +
                '\n4-2=2' +
                '\n4*2=8' +
                '\n4/2=2';
        System.assertEquals(expectedText, output);
    }
}
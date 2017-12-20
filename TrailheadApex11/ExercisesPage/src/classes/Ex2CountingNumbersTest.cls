/**
 * Created by Kuba on 06.12.2017.
 */
@isTest
public with sharing class Ex2CountingNumbersTest {
    @isTest static void solveTheExerciseTest() {
        ExercisesLoader exercisesLoader = new Ex2CountingNumbers();
        List<String> testList = new List<String>();
        String maciej = 'Maciej';
        Integer maciejLenght = maciej.length();
        testList.add(maciej);
        String output = exercisesLoader.solveTheExercise(testList);
        String expected = 'Maciej has 6 characters';
        System.assertEquals(expected, output);
    }
}
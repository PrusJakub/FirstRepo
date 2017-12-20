/**
 * Created by Kuba on 06.12.2017.
 */
@isTest
public with sharing class Ex6RetirementCalculatorTest {
    @isTest static void solveTheExerciseTest() {
        ExercisesLoader exercisesLoader = new Ex6RetirementCalculator();
        List<String> testList = new List<String>();
        String maciej = '20';
        String andrzej = '30';
        testList.add(maciej);
        testList.add(andrzej);
        String output = exercisesLoader.solveTheExercise(testList);
        String expectedText = 'What is your current Age? 20' +
                '\nAt what age would you like to retire? 30' +
                '\nYou have 10 until you can retire.' +
                '\nIt\'s 2017, so you can retire in 2027';
        System.assertEquals(expectedText, output);
    }
}
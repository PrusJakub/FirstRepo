/**
 * Created by Kuba on 06.12.2017.
 */
@isTest
public with sharing class Ex4MadLibTest {
    @isTest static void solveTheExerciseTest() {
        ExercisesLoader exercisesLoader = new Ex4MadLib();
        List<String> testList = new List<String>();
        String maciej = 'Maciej';
        String andrzej = 'Andrzej';
        String michal = 'Michal';
        String krzysiek = 'Krzysiek';
        testList.add(maciej);
        testList.add(andrzej);
        testList.add(michal);
        testList.add(krzysiek);
        String output = exercisesLoader.solveTheExercise(testList);
        String expectedText = 'Enter a noun: Maciej\nEnter a verb: Andrzej\nEnter an adjective: Michal\nEnter an adverb: Krzysiek' +
                '\nDo you Andrzej your Michal Maciej Krzysiek';
        System.assertEquals(expectedText, output);
    }
}
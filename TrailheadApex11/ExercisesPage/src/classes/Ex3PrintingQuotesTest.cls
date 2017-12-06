/**
 * Created by Kuba on 06.12.2017.
 */
@isTest
public with sharing class Ex3PrintingQuotesTest {
    @isTest static void solveTheExerciseTest() {
        ExercisesLoader exercisesLoader = new Ex3PrintingQuotes();
        List<String> testList = new List<String>();
        String maciej = 'Maciej';
        String andrzej = 'Andrzej';
        testList.add(maciej);
        testList.add(andrzej);
        String output = exercisesLoader.solveTheExercise(testList);
        String expectedText = 'What is the quote? Maciej\nWho said it? Andrzej\nAndrzej says "Maciej"';
        System.assertEquals(expectedText, output);
    }
}
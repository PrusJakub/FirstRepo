
public with sharing class ExercisesController {
    public String inputExerciseString { get; set; }
    public String outputExerciseString { get; set; }
    public String infoExerciseString { get; set; }
    public String className { get; set; }

    public List<SelectOption> getItems() {
        List<SelectOption> options = new List<SelectOption>();
        options.add(new SelectOption('', '---Select---'));
        options.add(new SelectOption(UtilConstants.ex1, 'Saying Hello'));
        options.add(new SelectOption(UtilConstants.ex2, 'Counting the Number of Characters'));
        options.add(new SelectOption(UtilConstants.ex3, 'Printing Quotes'));
        options.add(new SelectOption(UtilConstants.ex4, 'Mad Lib'));
        options.add(new SelectOption(UtilConstants.ex5, 'Simple Math'));
        options.add(new SelectOption(UtilConstants.ex6, 'Retirement Calculator'));

        return options;
    }

    public void solve() {
        if (className == null) {
            outputExerciseString = 'You have to choose the exercise! ';
            return;
        }
        List<String> splittedInputString = inputExerciseString.split('\n');

        ExercisesLoader exercise;

        if (className.equals(UtilConstants.ex1)) {
            exercise = new Ex1SayingHello();
        } else if (className.equals(UtilConstants.ex2)) {
            exercise = new Ex2CountingNumbers();
        } else if (className.equals(UtilConstants.ex3)) {
            exercise = new Ex3PrintingQuotes();
        } else if (className.equals(UtilConstants.ex4)) {
            exercise = new Ex4MadLib();
        } else if (className.equals(UtilConstants.ex5)) {
            exercise = new Ex5SimpleMath();
        } else if (className.equals(UtilConstants.ex6)) {
            exercise = new Ex6RetirementCalculator();
        }

        try {
            System.debug(exercise);
            System.debug(className);
            outputExerciseString = exercise.solveTheExercise(splittedInputString);
        } catch (Exception e) {
            System.debug(e.getStackTraceString());
            ApexPages.addMessages(e);
        }
    }

    public void showInfo() {
        try {
            if (className == null) {
                infoExerciseString = '';
            } else if (className.equals('SayingHello')) {
                infoExerciseString = 'Name:';
            } else if (className.equals('CountingNumbers')) {
                infoExerciseString = 'Word to be counted:';
            } else if (className.equals('PrintingQuotes')) {
                infoExerciseString = 'What is the quote:'
                        + '\nWho said it?: ';
            } else if (className.equals('MadLib')) {
                infoExerciseString = 'Enter a noun: '
                        + '\nEnter a verb: '
                        + '\nEnter an adjective: '
                        + '\nEnter an adverb: ';
            } else if (className.equals('SimpleMath')) {
                infoExerciseString = 'First Number:'
                        + '\nSecond Number:';
            } else if (className.equals('RetirementCalculator')) {
                infoExerciseString = 'What is your age:'
                        + '\nIn what age you will retire:';
            }
        } catch (ExerciseException e) {
            e.getStackTraceString();
        }
    }

    public static List<String> deleteBlankChars(List<String> input) {
        if (input.isEmpty()) {
            throw new ExerciseException(UtilConstants.emptyInput);
        }
        List<String> inputWithoutBlanks = new List<String>();
        for (String st : input) {
            if (st == '' || st == ('\n')) {
            } else {
                inputWithoutBlanks.add(st);
            }
        }
        return inputWithoutBlanks;
    }
}
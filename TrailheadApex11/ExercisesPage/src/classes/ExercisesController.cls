
public with sharing class ExercisesController {
    public String inputExerciseString { get; set; }
    public String outputExerciseString { get; set; }
    public String infoExerciseString { get; set; }
    public String className { get; set; }


    public List<SelectOption> getItems() {
        List<SelectOption> options = new List<SelectOption>();
        options.add(new SelectOption('', '---Select---'));
        options.add(new SelectOption('SayingHello', 'Saying Hello'));
        options.add(new SelectOption('CountingNumbers', 'Counting the Number of Characters'));
        options.add(new SelectOption('PrintingQuotes', 'Printing Quotes'));
        options.add(new SelectOption('MadLib', 'Mad Lib'));
        options.add(new SelectOption('SimpleMath', 'Simple Math'));
        options.add(new SelectOption('RetirementCalculator', 'Retirement Calculator'));

        return options;
    }

    public void solve() {
        if (className == null) {
            outputExerciseString = 'You have to choose the exercise! ';
            return;
        }
        List<String> splittedInputString = inputExerciseString.split('\n');

        ExercisesLoader exercise;

        if (className.equals('SayingHello')) {
            exercise = new Ex1SayingHello();
        } else if (className.equals('CountingNumbers')) {
            exercise = new Ex2CountingNumbers();
        } else if (className.equals('PrintingQuotes')) {
            exercise = new Ex3PrintingQuotes();
        } else if (className.equals('MadLib')) {
            exercise = new Ex4MadLib();
        } else if (className.equals('SimpleMath')) {
            exercise = new Ex5SimpleMath();
        } else if (className.equals('RetirementCalculator')) {
            exercise = new Ex6RetirementCalculator();
        }

        outputExerciseString = exercise.solveTheExercise(splittedInputString);

    }

    public void showInfo() {
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

    }
    public static List<String> isInputEmpty(List<String> input) {
        boolean isInputEmpty = true;
        List<String> inputWithoutBlanks = new List<String>();
        for (String st : input) {
            if (st == '' || st == ('\n')) {
                isInputEmpty = true;
            } else {
                inputWithoutBlanks.add(st);
            }
        }
        return inputWithoutBlanks;
    }
}
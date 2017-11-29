
public with sharing class ExercisesController {
    public String inputExerciseString { get; set; }
    public String outputExerciseString { get; set; }
    public String className { get; set; }


    public List<SelectOption> getItems() {
        List<SelectOption> options = new List<SelectOption>();
        options.add(new SelectOption('', '---Select---'));
        options.add(new SelectOption('SayingHello', 'Saying Hello'));
        options.add(new SelectOption('CountingNumbers', 'Counting the Number of Characters'));
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
        }


        outputExerciseString = exercise.solveTheExercise(splittedInputString);


    }

    public static String isInputEmpty(List<String> input) {
        boolean isInputEmpty = true;

        for (String st : input) {
            if (st == '' || st == ('\n')) {
                isInputEmpty = true;
            } else {
                return st;
            }
        }
        return null;
    }
}
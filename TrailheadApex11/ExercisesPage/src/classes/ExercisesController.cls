
public with sharing class ExercisesController {
    public String inputExerciseString { get; set; }
    public String outputExerciseString { get; set; }
    public String className { get; set; }


    public List<SelectOption> getItems() {
        List<SelectOption> options = new List<SelectOption>();
        options.add(new SelectOption('', '---Select---'));
        options.add(new SelectOption('SayingHello', 'Saying Hello'));
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
        }


        outputExerciseString = exercise.solveTheExercise(splittedInputString);


    }
}
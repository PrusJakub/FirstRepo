
public with sharing class ExercisesController {
    public String inputExerciseString { get; set; }
    public String outputExerciseString { get; set; }
    public String className { get; set; }


    public List<SelectOption> getItems() {
        List<SelectOption> options = new List<SelectOption>();
        options.add(new SelectOption('', '---Select---'));
        options.add(new SelectOption('ex1SayingHello', 'Saying Hello'));
        return options;
    }

    public void solve() {
        outputExerciseString = 'sth';
    }
}
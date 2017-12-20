public with sharing class Ex3PrintingQuotes implements ExercisesLoader {

    public String solveTheExercise(List<String> input) {
        List<String> validatedList = ExercisesController.deleteBlankChars(input);
        if (validatedList.size() < 2) {
            throw new ExerciseException(UtilConstants.emptyInputOrTooShortInput);
        }
        String quote = validatedList.get(0);
        String saidBy = validatedList.get(1);

        return 'What is the quote? ' + quote
                + '\nWho said it? ' + saidBy
                + '\n' + saidBy + ' says "' + quote + '"';
    }
}
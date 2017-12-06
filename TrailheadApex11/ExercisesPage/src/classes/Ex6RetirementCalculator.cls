/**
 * Created by Kuba on 29.11.2017.
 */

public with sharing class Ex6RetirementCalculator implements ExercisesLoader {
    public String solveTheExercise(List<String> input) {
        List<String> validatedList = ExercisesController.deleteBlankChars(input);
        if (validatedList.size() < 2) {
            throw new ExerciseException(UtilConstants.emptyInputOrTooShortInput);
        }
        String currentAge = validatedList.get(0);
        String retirementAge = validatedList.get(1);
        Integer currentAgeInteger = Integer.valueOf(currentAge);
        Integer retirementAgeInteger = Integer.valueOf(retirementAge);

        return 'What is your current Age? ' + currentAge
                + '\nAt what age would you like to retire? ' + retirementAge
                + '\nYou have ' + (retirementAgeInteger - currentAgeInteger) + ' until you can retire.'
                + '\nIt\'s 2017, so you can retire in ' + (2017 + (retirementAgeInteger - currentAgeInteger));
    }
}


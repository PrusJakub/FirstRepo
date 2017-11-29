/**
 * Created by Kuba on 29.11.2017.
 */

public with sharing class Ex6RetirementCalculator implements ExercisesLoader {
    public String solveTheExercise(List<String> input) {
        try {
            String currentAge = ExercisesController.isInputEmpty(input).get(0);
            String retirementAge = ExercisesController.isInputEmpty(input).get(1);
            Integer currentAgeInteger = Integer.valueOf(currentAge);
            Integer retirementAgeInteger = Integer.valueOf(retirementAge);

            if (currentAge == null) {
                return 'You have to type text to be solved';
            } else {
                return 'What is your current Age? ' + currentAge
                        + '\nAt what age would you like to retire? ' + retirementAge
                        + '\nYou have ' + (retirementAgeInteger - currentAgeInteger) + ' until you can retire.'
                        + '\nIt\'s 2017, so you can retire in ' + (2017 + (retirementAgeInteger - currentAgeInteger));
            }
        } catch (Exception e) {
            return 'You have to type text to be solved or you didn\'t type required lines of text or didn\'t typed numbers';
        }
    }

}
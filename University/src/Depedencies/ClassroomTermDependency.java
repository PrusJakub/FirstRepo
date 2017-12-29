package Depedencies;

import UniveristyPackage.University;

public class ClassroomTermDependency implements UniversityDependency {

    @Override
    public void addDependency(String firstString, String secondString) {
        if (University.termsMap.containsKey(secondString)) {
            if (University.classroomsMap.containsKey(firstString)) {
                University.termsMap.get(secondString).classroomIds.add(firstString);
            }
        }
    }

    @Override
    public void showDependency(String firstString) {
        System.out.println("Sale, w ktorych zajecia sa w " + University.termsMap.get(firstString).name);
        for (String depedency : University.termsMap.get(firstString).classroomIds) {
            System.out.println(University.classroomsMap.get(depedency).name);
        }
    }
}

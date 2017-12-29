package Depedencies;

import UniveristyPackage.University;

public class ClassroomTermDependency implements UniversityDependency {

    @Override
    public void addDependency(University university, String firstString, String secondString) {
        if (university.termsMap.containsKey(secondString)) {
            if (university.classroomsMap.containsKey(firstString)) {
                university.termsMap.get(secondString).classroomIds.add(firstString);
            }
        }
    }

    @Override
    public void showDependency(University university, String firstString) {
        System.out.println("Sale, w ktorych zajecia sa w " + university.termsMap.get(firstString).name);
        for (String depedency : university.termsMap.get(firstString).classroomIds) {
            System.out.println(university.classroomsMap.get(depedency).name);
        }
    }
}

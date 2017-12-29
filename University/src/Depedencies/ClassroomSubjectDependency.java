package Depedencies;

import UniveristyPackage.University;

public class ClassroomSubjectDependency implements UniversityDependency {

    @Override
    public void addDependency(University university, String firstString, String secondString) {
        if (university.subjectsMap.containsKey(secondString)) {
            if (university.classroomsMap.containsKey(firstString)) {
                university.subjectsMap.get(secondString).classroomIds.add(firstString);
            }
        }
    }

    @Override
    public void showDependency(University university, String firstString) {
        System.out.println("Sale, w ktorych odbywa sie " + university.subjectsMap.get(firstString).name);
        for (String depedency : university.subjectsMap.get(firstString).classroomIds) {
            System.out.println(university.classroomsMap.get(depedency).name);
        }
    }
}

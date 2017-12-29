package Depedencies;

import UniveristyPackage.University;

public class ClassroomSubjectDependency implements UniversityDependency {

    @Override
    public void addDependency(String firstString, String secondString) {
        if (University.subjectsMap.containsKey(secondString)) {
            if (University.classroomsMap.containsKey(firstString)) {
                University.subjectsMap.get(secondString).classroomIds.add(firstString);
            }
        }
    }

    @Override
    public void showDependency(String firstString) {
        System.out.println("Sale, w ktorych odbywa sie " + University.subjectsMap.get(firstString).name);
        for (String depedency : University.subjectsMap.get(firstString).classroomIds) {
            System.out.println(University.classroomsMap.get(depedency).name);
        }
    }
}

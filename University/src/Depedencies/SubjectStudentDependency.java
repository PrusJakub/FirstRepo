package Depedencies;

import UniveristyPackage.University;

public class SubjectStudentDependency implements UniversityDependency {

    @Override
    public void addDependency(String firstString, String secondString) {
        if (University.studentsMap.containsKey(secondString)) {
            if (University.subjectsMap.containsKey(firstString)) {
                University.studentsMap.get(secondString).subjectIds.add(firstString);
            }
        }
    }

    @Override
    public void showDependency(String firstString) {
        System.out.println("Przedmioty, na ktore uczescza " + University.studentsMap.get(firstString).name);
        for (String dependency : University.studentsMap.get(firstString).subjectIds) {
            System.out.println(University.subjectsMap.get(dependency).name);
        }
    }
}

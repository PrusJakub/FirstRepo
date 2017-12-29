package Depedencies;

import UniveristyPackage.University;

public class SubjectStudentDependency implements UniversityDependency {

    @Override
    public void addDependency(University university, String firstString, String secondString) {
        if (university.studentsMap.containsKey(secondString)) {
            if (university.subjectsMap.containsKey(firstString)) {
                university.studentsMap.get(secondString).subjectIds.add(firstString);
            }
        }
    }

    @Override
    public void showDependency(University university, String firstString) {
        System.out.println("Przedmioty, na ktore uczescza " + university.studentsMap.get(firstString).name);
        for (String dependency : university.studentsMap.get(firstString).subjectIds) {
            System.out.println(university.subjectsMap.get(dependency).name);
        }
    }
}

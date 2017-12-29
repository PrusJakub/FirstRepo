package Depedencies;

import UniveristyPackage.University;

public class TermSubjectDependency implements UniversityDependency {

    @Override
    public void addDependency(University university, String firstString, String secondString) {
        if (university.subjectsMap.containsKey(secondString)) {
            if (university.termsMap.containsKey(firstString)) {
                university.subjectsMap.get(secondString).termIds.add(firstString);
            }
        }
    }

    @Override
    public void showDependency(University university, String firstString) {
        System.out.println("Terminy, w ktorych odbywa sie " + university.subjectsMap.get(firstString).name);
        for (String dependency : university.subjectsMap.get(firstString).termIds) {
            System.out.println(university.termsMap.get(dependency).name);
        }
    }
}

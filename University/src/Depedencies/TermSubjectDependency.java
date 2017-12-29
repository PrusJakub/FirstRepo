package Depedencies;

import UniveristyPackage.University;

public class TermSubjectDependency implements UniversityDependency {

    @Override
    public void addDependency(String firstString, String secondString) {
        if (University.subjectsMap.containsKey(secondString)) {
            if (University.termsMap.containsKey(firstString)) {
                University.subjectsMap.get(secondString).termIds.add(firstString);
            }
        }
    }

    @Override
    public void showDependency(String firstString) {
        System.out.println("Terminy, w ktorych odbywa sie " + University.subjectsMap.get(firstString).name);
        for (String dependency : University.subjectsMap.get(firstString).termIds) {
            System.out.println(University.termsMap.get(dependency).name);
        }
    }
}

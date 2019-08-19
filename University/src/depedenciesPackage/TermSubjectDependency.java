package depedenciesPackage;

import univeristyPackage.University;

public class TermSubjectDependency implements UniversityDependency {

    @Override
    public void addDependency(String toDependency, String dependencyOwner) {
        if (University.subjectsMap.containsKey(dependencyOwner)) {
            if (University.termsMap.containsKey(toDependency)) {
                University.subjectsMap.get(dependencyOwner).termIds.add(toDependency);
            }
        }
    }

    @Override
    public void showDependency(String dependencyOwner) {
        System.out.println("Terminy, w ktorych odbywa sie " + University.subjectsMap.get(dependencyOwner).name);
        for (String dependency : University.subjectsMap.get(dependencyOwner).termIds) {
            System.out.println(University.termsMap.get(dependency).name);
        }
    }
}

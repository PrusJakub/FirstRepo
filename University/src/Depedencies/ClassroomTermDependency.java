package Depedencies;

import UniveristyPackage.University;

public class ClassroomTermDependency implements UniversityDependency {

    @Override
    public void addDependency(String toDependency, String dependencyOwner) {
        if (University.termsMap.containsKey(dependencyOwner)) {
            if (University.classroomsMap.containsKey(toDependency)) {
                University.termsMap.get(dependencyOwner).classroomIds.add(toDependency);
            }
        }
    }

    @Override
    public void showDependency(String dependencyOwner) {
        System.out.println("Sale, w ktorych zajecia sa w " + University.termsMap.get(dependencyOwner).name);
        for (String depedency : University.termsMap.get(dependencyOwner).classroomIds) {
            System.out.println(University.classroomsMap.get(depedency).name);
        }
    }
}

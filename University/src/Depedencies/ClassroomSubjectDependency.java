package Depedencies;

import UniveristyPackage.University;

public class ClassroomSubjectDependency implements UniversityDependency {

    @Override
    public void addDependency(String toDependency, String dependencyOwner) {
        if (University.subjectsMap.containsKey(dependencyOwner)) {
            if (University.classroomsMap.containsKey(toDependency)) {
                University.subjectsMap.get(dependencyOwner).classroomIds.add(toDependency);
            }
        }
    }

    @Override
    public void showDependency(String dependencyOwner) {
        System.out.println("Sale, w ktorych odbywa sie " + University.subjectsMap.get(dependencyOwner).name);
        for (String depedency : University.subjectsMap.get(dependencyOwner).classroomIds) {
            System.out.println(University.classroomsMap.get(depedency).name);
        }
    }
}

package depedenciesPackage;

import univeristyPackage.University;

public class SubjectStudentDependency implements UniversityDependency {

    @Override
    public void addDependency(String toDependency, String dependencyOwner) {
        if (University.studentsMap.containsKey(dependencyOwner)) {
            if (University.subjectsMap.containsKey(toDependency)) {
                University.studentsMap.get(dependencyOwner).subjectIds.add(toDependency);
            }
        }
    }

    @Override
    public void showDependency(String dependencyOwner) {
        System.out.println("Przedmioty, na ktore uczescza " + University.studentsMap.get(dependencyOwner).name);
        for (String dependency : University.studentsMap.get(dependencyOwner).subjectIds) {
            System.out.println(University.subjectsMap.get(dependency).name);
        }
    }
}

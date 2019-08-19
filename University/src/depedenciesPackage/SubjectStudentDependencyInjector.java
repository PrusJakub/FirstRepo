package depedenciesPackage;

import univeristyPackage.University;

public class SubjectStudentDependencyInjector implements UniversityDependencyInjector {
    @Override
    public Consumer getConsumer() {
        return new University(new SubjectStudentDependency());
    }
}

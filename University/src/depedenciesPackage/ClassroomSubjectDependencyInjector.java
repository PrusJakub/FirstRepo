package depedenciesPackage;

import univeristyPackage.University;

public class ClassroomSubjectDependencyInjector implements UniversityDependencyInjector {
    @Override
    public Consumer getConsumer() {
        return new University(new ClassroomSubjectDependency());
    }
}

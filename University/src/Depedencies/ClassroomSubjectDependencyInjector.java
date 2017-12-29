package Depedencies;

import UniveristyPackage.University;

public class ClassroomSubjectDependencyInjector implements UniversityDependencyInjector {
    @Override
    public Consumer getConsumer() {
        return new University(new ClassroomSubjectDependency());
    }
}

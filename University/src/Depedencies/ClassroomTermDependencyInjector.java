package Depedencies;

import UniveristyPackage.University;

public class ClassroomTermDependencyInjector implements UniversityDependencyInjector {
    @Override
    public Consumer getConsumer() {
        return new University(new ClassroomTermDependency());
    }
}

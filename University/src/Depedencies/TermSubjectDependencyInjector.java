package Depedencies;

import UniveristyPackage.University;

public class TermSubjectDependencyInjector implements UniversityDependencyInjector {
    @Override
    public Consumer getConsumer() {
        return new University(new TermSubjectDependency());
    }
}

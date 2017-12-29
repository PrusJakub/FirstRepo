package Depedencies;

public interface UniversityDependency {
    void addDependency(String toDependency, String dependencyOwner);
    void showDependency(String dependencyOwner);
}

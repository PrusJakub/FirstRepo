package Depedencies;

public interface Consumer {
    void createDependencies(String toDependency, String dependencyOwner);
    void showDependencies(String dependencyOwner);
}

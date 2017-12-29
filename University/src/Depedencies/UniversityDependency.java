package Depedencies;

import UniveristyPackage.University;

public interface UniversityDependency {
    void addDependency(University university, String firstString, String secondString);
    void showDependency(University university, String firstString);
}

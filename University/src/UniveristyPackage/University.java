package UniveristyPackage;

import Depedencies.Consumer;
import Depedencies.UniversityDependency;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University extends SObject implements Consumer{

    private UniversityDependency dependency;

    public static Map<String, Student> studentsMap = new HashMap<>();
    public static Map<String, Subject> subjectsMap = new HashMap<>();
    public static Map<String, Term> termsMap = new HashMap<>();
    public static Map<String, Classroom> classroomsMap = new HashMap<>();

    public University(String id, String name) {
        super(id, name);
    }
    public University(UniversityDependency ud){
        this.dependency = ud;
    }

    public void addStudents(List<Student> students) {
        for (Student s : students) {
            studentsMap.put(s.getId(), s);
        }
    }

    public void addSubjects(List<Subject> subjects) {
        for (Subject s : subjects) {
            subjectsMap.put(s.getId(), s);
        }
    }

    public void addTerms(List<Term> terms) {
        for (Term t : terms) {
            termsMap.put(t.getId(), t);
        }
    }

    public void addClassrooms(List<Classroom> classrooms) {
        for (Classroom c : classrooms) {
            classroomsMap.put(c.getId(), c);
        }
    }


    @Override
    public void createDependencies(String toDependency, String dependencyOwner) {
        this.dependency.addDependency(toDependency, dependencyOwner);
    }

    @Override
    public void showDependencies(String dependencyOwner){
        this.dependency.showDependency(dependencyOwner);
    }
}
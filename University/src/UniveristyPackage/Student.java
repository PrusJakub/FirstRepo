package UniveristyPackage;

import java.util.LinkedList;
import java.util.List;


public class Student extends SObject {
    String firstName;
    String lastName;
    int age;
    int year;

    List<String> subjects = new LinkedList<>();

    public Student(String id, String firstName, String lastName, int age, int year) {
        super(id, firstName + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.year = year;
    }

    void addSubject(String subjectId) {
        subjects.add(subjectId);
    }

    String getSubjects(int i) {
        return subjects.get(i);
    }

    String getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }
}

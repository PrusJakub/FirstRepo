package UniveristyPackage;

import java.util.HashSet;
import java.util.Set;

public class Student extends SObject {
    String firstName;
    String lastName;
    int age;
    int year;

    Set<String> subjects = new HashSet<>();

    public Student(String id, String firstName, String lastName, int age, int year) {
        super(id, firstName + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.year = year;
    }

    void addSubjec(Subject subject){
        subjects.add(subject.getId());
    }

    String getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }
}

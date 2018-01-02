package univeristyPackage;

import java.util.HashSet;
import java.util.Set;

public class Student extends SObject {
    public String firstName;
    public String lastName;
    public int age;
    public int year;

    public Set<String> subjectIds = new HashSet<>();

    public Student(String id, String firstName, String lastName, int age, int year) {
        super(id, firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.year = year;
    }
}
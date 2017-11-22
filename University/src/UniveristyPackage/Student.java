package UniveristyPackage;

import java.util.LinkedList;
import java.util.List;

public class Student extends SClass {
    public Student(int Id, String Name){
        this.Name = Name;
        this.Id = Id;
        this.CreatedBy = magicStrings.createdBy;
        this.CreatedDate = magicStrings.createdDate;
    }
    List<Subject> studentsSubjects = new LinkedList<>();

    void addSubject(Subject subject){
        studentsSubjects.add(subject);
    }

    String firstName;
    String lastName;
    int age;
    int year;

    int getId(){
        return this.Id;
    }

    String getName(){
        return this.Name;
    }
}

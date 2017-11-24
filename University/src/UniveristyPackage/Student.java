package UniveristyPackage;

import java.util.LinkedList;
import java.util.List;

class Student extends SObject {
    String firstName;
    String lastName;
    int age;
    int year;

    public Student(int Id, String Name){
        this.Name = Name;
        this.Id = Id;
        this.CreatedBy = magicStrings.createdBy;
        this.CreatedDate = magicStrings.createdDate;
    }
    final List<Subject> studentsSubjects = new LinkedList<>();

    void addSubject(Subject subject){
        studentsSubjects.add(subject);
    }


    int getId(){
        return this.Id;
    }

    String getName(){
        return this.Name;
    }
}

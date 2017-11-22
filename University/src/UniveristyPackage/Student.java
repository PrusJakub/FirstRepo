package UniveristyPackage;

public class Student extends University {
    public Student(int Id, String Name){
        this.Name = Name;
        this.Id = Id;
        this.CreatedBy = magicStrings.createdBy;
        this.CreatedDate = magicStrings.createdDate;
        addObject(this);
    }
    String firstName;
    String lastName;
    int age;
    int year;
}

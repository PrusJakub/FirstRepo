package UniveristyPackage;

public class Classroom extends University {
    public Classroom(int Id, String Name){
        this.Name = Name;
        this.Id = Id;
        this.CreatedBy = magicStrings.createdBy;
        this.CreatedDate = magicStrings.createdDate;
        addObject(this);
    }



}

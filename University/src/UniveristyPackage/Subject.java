package UniveristyPackage;

public class Subject extends University {
    public Subject(int Id, String Name){
        this.Name = Name;
        this.Id = Id;
        this.CreatedBy = magicStrings.createdBy;
        this.CreatedDate = magicStrings.createdDate;
        addObject(this);
    }

}

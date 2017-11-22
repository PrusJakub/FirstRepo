package UniveristyPackage;

public class Term extends University {
    public Term(int Id, String Name) {
        this.Name = Name;
        this.Id = Id;
        this.CreatedBy = magicStrings.createdBy;
        this.CreatedDate = magicStrings.createdDate;
        addObject(this);
    }
}

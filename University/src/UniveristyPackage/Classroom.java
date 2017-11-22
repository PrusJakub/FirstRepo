package UniveristyPackage;

public class Classroom extends SClass {
    public Classroom(int Id, String Name){
        this.Name = Name;
        this.Id = Id;
        this.CreatedBy = magicStrings.createdBy;
        this.CreatedDate = magicStrings.createdDate;
    }
    int getId(){
        return this.Id;
    }

    String getName(){
        return this.Name;
    }

}

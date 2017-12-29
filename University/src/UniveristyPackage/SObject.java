package UniveristyPackage;


import java.time.LocalDate;

abstract class SObject {

    public String id;
    public String name;
    public String createdBy;
    public LocalDate createdDate;

    public SObject() {

    }

    public SObject(String id, String name) {
        this.id = id;
        this.name = name;
        createdBy = ProjectDefaults.DEFAULT_CREATED_BY;
        createdDate = LocalDate.now();
    }

    String getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

}

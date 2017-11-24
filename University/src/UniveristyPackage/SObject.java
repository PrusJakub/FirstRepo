package UniveristyPackage;

import java.time.LocalDate;

abstract class SObject {
    String id;
    String name;
    String createdBy;
    LocalDate createdDate;

    public SObject() {

    }

    public SObject(String id, String name) {
        this.id = id;
        this.name = name;
        createdBy = ProjectDefaults.createdBy;
        createdDate = ProjectDefaults.createdDate;
    }


}

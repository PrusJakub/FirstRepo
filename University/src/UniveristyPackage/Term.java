package UniveristyPackage;

public class Term extends SObject {

    // kiedy się zaczyna ten termin? w jakiej się odbywa sali? 

    public Term(String id, String name) {
        super(id, name);
    }

    // DRY!
    String getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }
}

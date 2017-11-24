package UniveristyPackage;

public class Term extends SObject {

    public Term(String id, String name) {
        super(id, name);
    }

    String getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }
}

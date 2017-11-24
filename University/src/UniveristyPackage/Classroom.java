package UniveristyPackage;

public class Classroom extends SObject {

    // ile się zmieści ludzi w tej sali? 

    public Classroom(String id, String name) {
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

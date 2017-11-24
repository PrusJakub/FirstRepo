package UniveristyPackage;

public class Classroom extends SObject {

    public Classroom(String id, String name) {
        super(id, name);
    }

    String getId(){
        return this.id;
    }

    String getName(){
        return this.name;
    }

}

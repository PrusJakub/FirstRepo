package UniveristyPackage;

public class Classroom extends SObject {

    private int capacity;

    public Classroom(String id, String name, int capacity) {
        super(id, name);
        this.capacity = capacity;
    }

}

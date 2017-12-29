package UniveristyPackage;

import java.util.HashSet;
import java.util.Set;

public class Term extends SObject {

    public Set<String> classroomIds = new HashSet<>();

    public Term(String id, String name) {
        super(id, name);
    }
}
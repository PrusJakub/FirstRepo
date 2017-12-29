package UniveristyPackage;

import java.util.HashSet;

import java.util.Set;

// te same uwagi do innych obiektów
public class Subject extends SObject {

    public Subject(String id, String name) {
        super(id, name);
    }

    // Set<String> clasroomIds, termIds - dlaczego chcę sety?
    public Set<String> classroomIds = new HashSet<>();
    public Set<String> termIds = new HashSet<>();
}
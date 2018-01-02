package univeristyPackage;

import java.util.HashSet;

import java.util.Set;

public class Subject extends SObject {

    public Set<String> classroomIds = new HashSet<>();
    public Set<String> termIds = new HashSet<>();

    public Subject(String id, String name) {
        super(id, name);
    }
}
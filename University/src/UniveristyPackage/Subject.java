package UniveristyPackage;

import java.util.LinkedList;
import java.util.List;

public class Subject extends SObject {

    public Subject(String id, String name) {
        super(id, name);
    }

    final List<String> classroomOfSubject = new LinkedList<>();
    final List<String> termOfSubject = new LinkedList<>();

    public void addClassroom(String room) {
        classroomOfSubject.add(room);
    }

    String getClassroom(int i) {
        return classroomOfSubject.get(i);
    }

    public void addTerm(String term) {
        termOfSubject.add(term);
    }

    String getTerm(int i) {
        return termOfSubject.get(i);
    }

    String getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }


}

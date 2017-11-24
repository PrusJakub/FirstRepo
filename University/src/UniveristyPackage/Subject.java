package UniveristyPackage;

import java.util.LinkedList;
import java.util.List;

// te same uwagi do innych obiektów
public class Subject extends SObject {

    public Subject(String id, String name) {
        super(id, name);
    }

    // Set<String> clasroomIds, termIds - dlaczego chcę sety?
    final List<String> classroomOfSubject = new LinkedList<>();
    final List<String> termOfSubject = new LinkedList<>();

    // co room? id?
    public void addClassroom(String room) {
        classroomOfSubject.add(room);
    }

    // to rozumiem kod, który służy do rzucania IndexOutOfBoundException? ;)
    // i co to jest, private? default? public może?
    String getClassroom(int i) {
        return classroomOfSubject.get(i);
    }

    // termId
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

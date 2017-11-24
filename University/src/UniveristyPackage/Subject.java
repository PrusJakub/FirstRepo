package UniveristyPackage;

import java.util.LinkedList;
import java.util.List;

public class Subject extends SObject {

    public Subject(String id, String name) {
        super(id, name);
    }

    final List<Classroom> classroomOfSubject = new LinkedList<>();
    final List<Term> termOfSubject = new LinkedList<>();

    public void addClassroom(Classroom room){
        classroomOfSubject.add(room);
    }

    public void addTerm(Term term){
        termOfSubject.add(term);
    }
    String getId(){
        return this.id;
    }

    String getName(){
        return this.name;
    }

}

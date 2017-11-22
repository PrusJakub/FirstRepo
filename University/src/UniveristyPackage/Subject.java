package UniveristyPackage;

import java.util.LinkedList;
import java.util.List;

class Subject extends SClass {
    public Subject(int Id, String Name){
        this.Name = Name;
        this.Id = Id;
        this.CreatedBy = magicStrings.createdBy;
        this.CreatedDate = magicStrings.createdDate;

    }

    final List<Classroom> classroomOfSubject = new LinkedList<>();
    final List<Term> termOfSubject = new LinkedList<>();

    void addClassroom(Classroom room){
        classroomOfSubject.add(room);
    }

    void addTerm(Term term){
        termOfSubject.add(term);
    }
    int getId(){
        return this.Id;
    }

    String getName(){
        return this.Name;
    }

}

package UniveristyPackage;

import java.util.LinkedList;
import java.util.List;

public class Subject extends SClass {
    public Subject(int Id, String Name){
        this.Name = Name;
        this.Id = Id;
        this.CreatedBy = magicStrings.createdBy;
        this.CreatedDate = magicStrings.createdDate;

    }

    List<Classroom> claaroomOfSubject = new LinkedList<>();
    List<Term> termOfSubject = new LinkedList<>();

    void addClassroom(Classroom room){
        claaroomOfSubject.add(room);
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

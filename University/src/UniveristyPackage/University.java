package UniveristyPackage;

import Depedencies.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University extends SObject {

    public Map<String, Student> studentsMap = new HashMap<>();
    public Map<String, Subject> subjectsMap = new HashMap<>();
    public Map<String, Term> termsMap = new HashMap<>();
    public Map<String, Classroom> classroomsMap = new HashMap<>();

    public University(String id, String name) {
        super(id, name);
    }

    public void addStudents(List<Student> students) {
        for (Student s : students) {
            studentsMap.put(s.getId(), s);
        }
    }

    public void addSubjects(List<Subject> subjects) {
        for (Subject s : subjects) {
            subjectsMap.put(s.getId(), s);
        }
    }

    public void addTerms(List<Term> terms) {
        for (Term t : terms) {
            termsMap.put(t.getId(), t);
        }
    }

    public void addClassrooms(List<Classroom> classrooms) {
        for (Classroom c : classrooms) {
            classroomsMap.put(c.getId(), c);
        }
    }

}
package UniveristyPackage;

import java.util.HashMap;
import java.util.Map;

// a tu gdzie jest konstruktor - id i name, hm? nulle mają być zawsze?
public class University extends SObject {

    private Map<String, Student> studentsMap = new HashMap<>();
    private Map<String, Subject> subjectsMap = new HashMap<>();
    private Map<String, Term> termsMap = new HashMap<>();
    private Map<String, Classroom> classroomsMap = new HashMap<>();

    public void addStudent(Student student) {
        addStudents(new List<Student>{
            student
        });
    }

    public void addStudents(List<Student> students) {
        for(Student s : student){
            studentsMap.put(student.getId(), student);
        }
    }

    public void addSubject(Subject subject) {
        subjectsMap.put(subject.getId(), subject);
    }

    public void addTerm(Term term) {
        termsMap.put(term.getId(), term);
    }

    public void addClassroom(Classroom classroom) {
        classroomsMap.put(classroom.getId(), classroom);
    }

    // jaki to ma sens? 
    // wysyłasz 2 id - wyciągasz odpowiedniego studenta i na nim dodajesz do seta odpowiednie id
    // bonusowo sprawdzaj czy id subjectu jest ok zanim je dodasz
    public void addSubjectsForStudent(Subject subject, Student student) {
        student.addSubject(subject.getId());
    }

    public void showSubjectsOfStudent(Student student) {
        for (int i = 0; i < student.subjects.size(); i++) {
            System.out.println(subjectsMap.get(student.getSubjects(i)).getName());
        }
    }

    public void addClassroomForSubject(Subject subject, Classroom classroom) {
        subject.addClassroom(classroom.getId());
    }

    public void showClassroomsOfSubject(Subject subject) {
        for (int i = 0; i < subject.classroomOfSubject.size(); i++) {
            System.out.println(classroomsMap.get(subject.getClassroom(i)).getName());
        }
    }

    public void addTermForSubject(Subject subject, Term term) {
        subject.addTerm(term.getId());
    }

    public void showTermsOfSubject(Subject subject) {
        for (int i = 0; i < subject.termOfSubject.size(); i++) {
            System.out.println(termsMap.get(subject.getTerm(i)).getName());
        }
    }


}


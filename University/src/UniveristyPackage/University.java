package UniveristyPackage;

import java.util.HashMap;
import java.util.Map;

public class University extends SObject {

    protected Map<String, Student> studentsMap = new HashMap<>();
    protected Map<String, Subject> subjectsMap = new HashMap<>();
    protected Map<String, Term> termsMap = new HashMap<>();
    protected Map<String, Classroom> classroomsMap = new HashMap<>();


    public void addStudent(Student student) {
        studentsMap.put(student.getId(), student);
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



    public void addSubjectsForStudent(Subject subject, Student student) {
        addSubject(subject);
    }

    public void showSubjectsOfStudent(Student student) {
        for (int i = 0; i < student.studentsSubjects.size(); i++) {
            Subject subject = student.studentsSubjects.get(i);
            System.out.println(subject.getName());
        }
    }

    public void addTermForSubject(Subject subject, Term term) {
        subject.addTerm(term);
    }

    public void addClassroomForSubject(Subject subject, Classroom classroom) {
        subject.addClassroom(classroom);
    }

    public void showTermsOfSubject(Subject subject) {
        for (int i = 0; i < subject.termOfSubject.size(); i++) {
            Term term = subject.termOfSubject.get(i);
            System.out.println(term.getName());
        }
    }

    public void showClassroomsOfSubject(Subject subject) {
        for (int i = 0; i < subject.termOfSubject.size(); i++) {
            Classroom classroom = subject.classroomOfSubject.get(i);
            System.out.println(classroom.getName());
        }
    }

}


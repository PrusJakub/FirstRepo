package UniveristyPackage;

import java.util.*;

public class University extends SClass {
    List<Student> students = new LinkedList<>();
    List<Classroom> classrooms = new LinkedList<>();
    List<Subject> subjects = new LinkedList<>();
    List<Term> terms = new LinkedList<>();

    void addObject(Student student) {
        students.add(student);
    }

    void addObject(Classroom room) {
        classrooms.add(room);
    }

    void addObject(Subject subject) {
        subjects.add(subject);
    }

    void addObject(Term term) {
        terms.add(term);
    }

    void addSubjectsForStudent(Subject subject, Student student) {
        student.addSubject(subject);
    }

    void showSubjectsOfStudent(Student student) {
        for(int i = 0; i < student.studentsSubjects.size(); i++){
            Subject subject =student.studentsSubjects.get(i);
            System.out.println(subject.getName());
        }
    }

    void addTermForSubject(Subject subject,Term term){
        subject.addTerm(term);
    }

    void addClassroomForSubject(Subject subject,Classroom classroom){
        subject.addClassroom(classroom);
    }

}


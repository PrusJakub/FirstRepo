package UniveristyPackage;

import java.util.HashMap;
import java.util.Map;

public class University extends SClass {
    Map<Integer, String> students = new HashMap<>();
    Map<Integer, String> rooms = new HashMap<>();
    Map<Integer, String> subjects = new HashMap<>();
    Map<Integer, String> terms = new HashMap<>();
    Map<Student, Subject> studentToSubjects = new HashMap<>();

    MagicStrings magicStrings = new MagicStrings();

    void addObject(Student student) {
        students.put(student.getId(), student.getName());
    }

    void addObject(Classroom room) {
        rooms.put(room.getId(), room.getName());
    }

    void addObject(Subject subject) {
        subjects.put(subject.getId(), subject.getName());
    }

    void addObject(Term term) {
        terms.put(term.getId(), term.getName());
    }

    int getId(){
        return this.Id;
    }

    String getName(){
        return this.Name;
    }

    void addSubjectsForStudent(Subject subject, Student student){
        studentToSubjects.put(student,subject);
    }

    void showSubjectsOfStudent(Student student){
        System.out.println(studentToSubjects.get(student));
    }
}

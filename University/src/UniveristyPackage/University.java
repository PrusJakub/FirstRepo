package UniveristyPackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// a tu gdzie jest konstruktor - id i name, hm? nulle mają być zawsze?
public class University extends SObject {

    private Map<String, Student> studentsMap = new HashMap<>();
    private Map<String, Subject> subjectsMap = new HashMap<>();
    private Map<String, Term> termsMap = new HashMap<>();
    private Map<String, Classroom> classroomsMap = new HashMap<>();


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

    // jaki to ma sens? 
    // wysyłasz 2 id - wyciągasz odpowiedniego studenta i na nim dodajesz do seta odpowiednie id
    // bonusowo sprawdzaj czy id subjectu jest ok zanim je dodasz

    public void addSubjectsForStudent(String subjectId, String studentId) {
        if(studentsMap.containsKey(studentId)){
            if(subjectsMap.containsKey(subjectId)){
                studentsMap.get(studentId).subjectIds.add(subjectId);
            }
        }
    }
    //W jaki sposob wyswietlic rzeczy z seta?
    public void showSubjectsOfStudent(String studentId) {
        studentsMap.get(studentId).subjectIds.
    }

    public void addClassroomForSubject(String subjectId, String classroomId) {
        if (subjectsMap.containsKey(subjectId)) {
            if (classroomsMap.containsKey(classroomId)) {
                subjectsMap.get(subjectId).classroomIds.add(classroomId);
            }
        }
    }

    public void showClassroomsOfSubject(Subject subject) {
        for (int i = 0; i < subject.classroomOfSubject.size(); i++) {
            System.out.println(classroomsMap.get(subject.getClassroom(i)).getName());
        }
    }


    public void addTermForSubject(String subjectId, String termId) {
        if (subjectsMap.containsKey(subjectId)) {
            if (termsMap.containsKey(termId)) {
                subjectsMap.get(subjectId).termIds.add(termId);
            }
        }
    }

    public void showTermsOfSubject(Subject subject) {
        for (int i = 0; i < subject.termOfSubject.size(); i++) {
            System.out.println(termsMap.get(subject.getTerm(i)).getName());
        }
    }


}


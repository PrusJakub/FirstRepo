package UniveristyPackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University extends SObject {

    private Map<String, Student> studentsMap = new HashMap<>();
    private Map<String, Subject> subjectsMap = new HashMap<>();
    private Map<String, Term> termsMap = new HashMap<>();
    private Map<String, Classroom> classroomsMap = new HashMap<>();

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

    public void addSubjectsForStudent(String subjectId, String studentId) {
        if (studentsMap.containsKey(studentId)) {
            if (subjectsMap.containsKey(subjectId)) {
                studentsMap.get(studentId).subjectIds.add(subjectId);
            }
        }
    }

    public void showSubjectsOfStudent(String studentId) {
        System.out.println("Przedmioty, na ktore uczescza " + studentsMap.get(studentId).name);
        for (String subject : studentsMap.get(studentId).subjectIds) {
            System.out.println(subjectsMap.get(subject).name);
        }
    }

    public void addClassroomForSubject(String subjectId, String classroomId) {
        if (subjectsMap.containsKey(subjectId)) {
            if (classroomsMap.containsKey(classroomId)) {
                subjectsMap.get(subjectId).classroomIds.add(classroomId);
            }
        }
    }

    public void showClassroomsOfSubject(String subjectId) {
        System.out.println("Sale, w ktorych odbywa sie " + subjectsMap.get(subjectId).name);
        for (String classroom : subjectsMap.get(subjectId).classroomIds) {
            System.out.println(classroomsMap.get(classroom).name);
        }
    }

    public void addTermForSubject(String subjectId, String termId) {
        if (subjectsMap.containsKey(subjectId)) {
            if (termsMap.containsKey(termId)) {
                subjectsMap.get(subjectId).termIds.add(termId);
            }
        }
    }

    public void showTermsOfSubject(String subjectId) {
        System.out.println("Terminy, w ktorych odbywa sie " + subjectsMap.get(subjectId).name);
        for (String term : subjectsMap.get(subjectId).termIds) {
            System.out.println(termsMap.get(term).name);
        }
    }
}
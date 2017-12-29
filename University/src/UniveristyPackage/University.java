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
    private UniversityDependency dependency;

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
        dependency = new SubjectStudentDependency();
        dependency.addDependency(this, subjectId, studentId);
    }

    public void showSubjectsOfStudent(String studentId) {
        dependency = new SubjectStudentDependency();
        dependency.showDependency(this, studentId);
    }

    public void addClassroomForSubject(String subjectId, String classroomId) {
        dependency = new ClassroomSubjectDependency();
        dependency.addDependency(this, classroomId, subjectId);
    }

    public void showClassroomsOfSubject(String subjectId) {
        dependency = new ClassroomSubjectDependency();
        dependency.showDependency(this, subjectId);
    }

    public void addTermForSubject(String subjectId, String termId) {
        dependency = new TermSubjectDependency();
        dependency.addDependency(this, termId, subjectId);
    }

    public void showTermsOfSubject(String subjectId) {
        dependency = new TermSubjectDependency();
        dependency.showDependency(this, subjectId);
    }

    public void addClassroomForTerm(String termId, String classroomId) {
        dependency = new ClassroomTermDependency();
        dependency.addDependency(this, classroomId, termId);
    }

    public void showClassroomsOfTerm(String termId) {
        dependency = new ClassroomTermDependency();
        dependency.showDependency(this, termId);
    }
}
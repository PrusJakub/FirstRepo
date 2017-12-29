package MainPackage;

import Depedencies.*;
import UniveristyPackage.*;

import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        University university = new University("university1", "Uniwersytet Warszawski");
        UniversityDependency dependency;
        List<Subject> subjects = new LinkedList<>();
        List<Student> students = new LinkedList<>();
        List<Term> terms = new LinkedList<>();
        List<Classroom> classrooms = new LinkedList<>();

        Student std1 = new Student("student1", "Wojciech", "Kowalski", 22, 4);
        Student std2 = new Student("student2", "Kamil", "Nowak", 20, 2);
        Student std3 = new Student("student3", "Maciej", "Lewandowski", 26, 5);
        Student std4 = new Student("student4", "Jakub", "Puczyk", 21, 3);

        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);

        university.addStudents(students);

        Subject sub1 = new Subject("subject1", "Matematyka");
        Subject sub2 = new Subject("subject2", "Przyroda");
        Subject sub3 = new Subject("subject3", "Geografia");
        Subject sub4 = new Subject("subject4", "Historia");

        subjects.add(sub1);
        subjects.add(sub2);
        subjects.add(sub3);
        subjects.add(sub4);

        university.addSubjects(subjects);

        Term term1 = new Term("term1", "Monday");
        Term term2 = new Term("term2", "Tuesday");
        Term term3 = new Term("term3", "Wednesday");
        Term term4 = new Term("term4", "Thursday");
        Term term5 = new Term("term5", "Friday");
        Term term6 = new Term("term6", "Saturday");
        Term term7 = new Term("term7", "Sunday");

        terms.add(term1);
        terms.add(term2);
        terms.add(term3);
        terms.add(term4);
        terms.add(term5);
        terms.add(term6);
        terms.add(term7);

        university.addTerms(terms);

        Classroom cr1 = new Classroom("classroom1", "100", 30);
        Classroom cr2 = new Classroom("classroom2", "101", 60);
        Classroom cr3 = new Classroom("classroom3", "102", 100);
        Classroom cr4 = new Classroom("classroom4", "201", 20);
        Classroom cr5 = new Classroom("classroom5", "202", 25);

        classrooms.add(cr1);
        classrooms.add(cr2);
        classrooms.add(cr3);
        classrooms.add(cr4);
        classrooms.add(cr5);

        university.addClassrooms(classrooms);

        UniversityDependencyInjector udInjector = null;
        Consumer app = null;
        udInjector = new SubjectStudentDependencyInjector();
        app = udInjector.getConsumer();

        app.createDependencies("subject1", "student1");
        app.createDependencies("subject2", "student1");
        app.createDependencies("subject3", "student1");
        app.createDependencies("subject4", "student1");
        app.createDependencies("subject1", "student2");
        app.showDependencies("student1");

        udInjector = new TermSubjectDependencyInjector();
        app = udInjector.getConsumer();
        app.createDependencies("term1", "subject1");
        app.createDependencies("term2", "subject1");
        app.createDependencies("term3", "subject1");
        app.createDependencies("term4", "subject1");
        app.createDependencies("term1", "subject2");
        app.createDependencies("term2", "subject2");
        app.showDependencies("subject1");

        udInjector = new ClassroomSubjectDependencyInjector();
        app = udInjector.getConsumer();
        app.createDependencies("classroom1", "subject1");
        app.createDependencies("classroom4", "subject1");
        app.createDependencies("classroom2", "subject1");
        app.createDependencies("classroom5", "subject1");
        app.createDependencies("classroom2", "subject2");
        app.createDependencies("classroom5", "subject2");
        app.showDependencies("subject1");

        udInjector = new ClassroomTermDependencyInjector();
        app = udInjector.getConsumer();
        app.createDependencies("classroom1", "term1");
        app.createDependencies("classroom4", "term1");
        app.createDependencies("classroom3", "term1");
        app.createDependencies("classroom2", "term1");
        app.createDependencies("classroom1", "term2");
        app.showDependencies("term1");
    }
}

package MainPackage;

import UniveristyPackage.*;

import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        University university = new University();
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

        Classroom cr1 = new Classroom("classroom1", "100");
        Classroom cr2 = new Classroom("classroom2", "101");
        Classroom cr3 = new Classroom("classroom3", "102");
        Classroom cr4 = new Classroom("classroom4", "201");
        Classroom cr5 = new Classroom("classroom5", "202");

        classrooms.add(cr1);
        classrooms.add(cr2);
        classrooms.add(cr3);
        classrooms.add(cr4);
        classrooms.add(cr5);

        university.addClassrooms(classrooms);



        // itd... 
        university.addSubjectsForStudent("subject1", "student1");
        university.addSubjectsForStudent("subject2", "student1");
        university.addSubjectsForStudent("subject3", "student1");
        university.addSubjectsForStudent("subject1", "student2");
        university.addSubjectsForStudent("subject2", "student2");

        university.showSubjectsOfStudent(students.get(0));
        System.out.println("");
        university.showSubjectsOfStudent(students.get(1));

        university.addTermForSubject(subjects.get(0), terms.get(0));
        university.addTermForSubject(subjects.get(0), terms.get(2));
        university.addTermForSubject(subjects.get(0), terms.get(5));
        university.addTermForSubject(subjects.get(1), terms.get(3));
        university.addTermForSubject(subjects.get(1), terms.get(4));

        System.out.println("");
        university.showTermsOfSubject(subjects.get(0));
        System.out.println("");
        university.showTermsOfSubject(subjects.get(1));
        System.out.println("");

        university.addClassroomForSubject(subjects.get(0), classrooms.get(0));
        university.addClassroomForSubject(subjects.get(0), classrooms.get(3));
        university.addClassroomForSubject(subjects.get(0), classrooms.get(4));
        university.addClassroomForSubject(subjects.get(1), classrooms.get(2));
        university.addClassroomForSubject(subjects.get(1), classrooms.get(1));

        university.showClassroomsOfSubject(subjects.get(0));
        System.out.println("");
        university.showClassroomsOfSubject(subjects.get(1));


    }
}

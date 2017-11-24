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

        //int studentsIndex = 0;
        int subjectsIndex = 0;
        int termsIndex = 0;
        int classroomsIndex = 0;

        Student std1 = new Student("student1", "Wojciech", "Kowalski", 22, 4);
        Student std2 = new Student("student2", "Kamil", "Nowak", 20, 2);
        Student std3 = new Student("student3", "Maciej", "Lewandowski", 26, 5);
        Student std4 = new Student("student4", "Jakub", "Puczyk", 21, 3);

        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);

        university.addStudent(students);

        // etc. etc...

        terms.add(new Term("term1", "Monday"));
        university.addTerm(terms.get(termsIndex++));
        terms.add(new Term("term2", "Tuesday"));
        university.addTerm(terms.get(termsIndex++));
        terms.add(new Term("term3", "Wednesday"));
        university.addTerm(terms.get(termsIndex++));
        terms.add(new Term("term4", "Thursday"));
        university.addTerm(terms.get(termsIndex++));
        terms.add(new Term("term5", "Friday"));
        university.addTerm(terms.get(termsIndex++));
        terms.add(new Term("term6", "Saturday"));
        university.addTerm(terms.get(termsIndex++));
        terms.add(new Term("term7", "Sunday"));
        university.addTerm(terms.get(termsIndex++));

        classrooms.add(new Classroom("classroom1", "100"));
        university.addClassroom(classrooms.get(classroomsIndex++));
        classrooms.add(new Classroom("classroom2", "101"));
        university.addClassroom(classrooms.get(classroomsIndex++));
        classrooms.add(new Classroom("classroom3", "102"));
        university.addClassroom(classrooms.get(classroomsIndex++));
        classrooms.add(new Classroom("classroom4", "201"));
        university.addClassroom(classrooms.get(classroomsIndex++));
        classrooms.add(new Classroom("classroom5", "202"));
        university.addClassroom(classrooms.get(classroomsIndex++));

        // itd... 
        university.addSubjectsForStudent(std1, students.get(0));
        university.addSubjectsForStudent(subjects.get(1), students.get(0));
        university.addSubjectsForStudent(subjects.get(2), students.get(0));
        university.addSubjectsForStudent(subjects.get(0), students.get(1));
        university.addSubjectsForStudent(subjects.get(1), students.get(1));

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

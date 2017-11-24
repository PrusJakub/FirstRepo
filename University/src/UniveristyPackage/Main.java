package UniveristyPackage;

class Main {
    public static void main(String[] args) {
        University university = new University();


        Student student1 = new Student(1, "Wojciech");
        university.addObject(student1);
        Student student2 = new Student(2, "Kamil");
        university.addObject(student2);
        Student student3 = new Student(3, "Maciej");
        university.addObject(student3);

        Subject subject1 = new Subject(1, "English");
        university.addObject(subject1);
        Subject subject2 = new Subject(2, "Polish");
        university.addObject(subject2);
        Subject subject3 = new Subject(3, "Maths");
        university.addObject(subject3);

        Term term1 = new Term(1, "1");
        university.addObject(term1);
        Term term2 = new Term(2, "2");
        university.addObject(term2);
        Term term3 = new Term(3, "3");
        university.addObject(term3);

        Classroom classroom1 = new Classroom(1, "100");
        university.addObject(classroom1);
        Classroom classroom2 = new Classroom(2, "101");
        university.addObject(classroom2);
        Classroom classroom3 = new Classroom(3, "102");
        university.addObject(classroom3);

        university.addClassroomForSubject(subject1, classroom1);
        university.addClassroomForSubject(subject1, classroom2);
        university.addClassroomForSubject(subject2, classroom3);

        university.addTermForSubject(subject1, term1);
        university.addTermForSubject(subject1, term2);

        university.addSubjectsForStudent(subject1, student1);
        university.addSubjectsForStudent(subject2, student1);
        university.addSubjectsForStudent(subject3, student1);
        university.addSubjectsForStudent(subject1, student2);
        university.addSubjectsForStudent(subject2, student2);

        university.showSubjectsOfStudent(student1);
        university.showSubjectsOfStudent(student2);

        university.showTermsOfSubject(subject1);
        university.showClassroomsOfSubject(subject1);

    }
}

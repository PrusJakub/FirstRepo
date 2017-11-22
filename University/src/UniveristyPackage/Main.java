package UniveristyPackage;

public class Main {
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

        university.addSubjectsForStudent(subject1, student1);
        university.addSubjectsForStudent(subject2, student1);
        university.addSubjectsForStudent(subject3, student1);
        university.addSubjectsForStudent(subject1, student2);
        university.addSubjectsForStudent(subject2, student2);

        university.showSubjectsOfStudent(student1);
        university.showSubjectsOfStudent(student2);



    }
}

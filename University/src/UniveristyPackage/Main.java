package UniveristyPackage;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        Student student1 = new Student(1, "Wojciech");
        Student student2 = new Student(2, "Kamil");
        Student student3 = new Student(3, "Maciej");

        Subject subject1 = new Subject(1, "English");
        Subject subject2 = new Subject(2, "Polish");
        Subject subject3 = new Subject(3, "Maths");

        university.addSubjectsForStudent(subject1, student1);
        university.addSubjectsForStudent(subject2, student1);
        university.addSubjectsForStudent(subject3, student1);
        university.addSubjectsForStudent(subject1, student2);
        university.addSubjectsForStudent(subject2, student2);

        university.showSubjectsOfStudent(student1);






    }
}

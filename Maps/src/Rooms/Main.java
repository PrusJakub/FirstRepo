package Rooms;


import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random generator = new Random();
        Student student = new Student();
        Room college = new Room();


        String studentName = student.names[generator.nextInt(7)]+ " " + student.surnames[generator.nextInt(6)];

        for(int i = 1; i<=143; i++){
            college.rooms.put(i, studentName);
        }

        System.out.println(college.rooms.size());

    }
}

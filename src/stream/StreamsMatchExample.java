package stream;

import data.StudentDatabase;

public class StreamsMatchExample {
    //Returns true if list has all data of students with Gpa greater than 3.9
    public static boolean allMatch(){
        return StudentDatabase.getAllStudents().stream()
                .allMatch((student)->student.getGpa()>3.9);
    }

    //Returns true if list has atleast onw data of students with Gpa greater than 3.9
    public static boolean anyMatch(){
        return StudentDatabase.getAllStudents().stream()
                .anyMatch((student)->student.getGpa()>3.9);
    }

    public static boolean noMatch(){
        return StudentDatabase.getAllStudents().stream()
                .noneMatch((student)->student.getGpa()>3.9);
    }
    public static void main(String[] args) {
        System.out.println("Result of All Match : "+ allMatch());
        System.out.println("Result of Any Match : "+ anyMatch());
        System.out.println("Result of No Match : "+ noMatch());
    }
}

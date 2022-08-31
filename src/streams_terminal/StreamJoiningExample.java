package streams_terminal;

import data.Student;
import data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamJoiningExample {

    public static String joining_1(){
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining_2(){
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joining_3(){
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","(",")"));
    }

    public static void main(String[] args) {
        System.out.println("Result of joining_1: "+ joining_1());

        System.out.println("Result of joining_2: "+ joining_2());

        System.out.println("Result of joining_3: "+ joining_3());
    }
}

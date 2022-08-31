package streams_terminal;

import data.Student;
import data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {

    public static int sumOfNoteBooks(){
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNotebooks));
    }

    public static double avgOfNoteBooks(){
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNotebooks));
    }

    public static void main(String[] args) {
        System.out.println("Total Notebooks accumulated by Students : " + sumOfNoteBooks());

        System.out.println("Avg No. of Books held by each student : " + avgOfNoteBooks());
    }
}

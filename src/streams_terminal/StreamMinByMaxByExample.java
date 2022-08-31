package streams_terminal;

import data.Student;
import data.StudentDatabase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMinByMaxByExample {

    public static Optional<Student> minByExample(){
        return StudentDatabase.getAllStudents()
                .stream().collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxByExample(){
        return StudentDatabase.getAllStudents()
                .stream().collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {
        System.out.println("Student with minimum Gpa in StudentDatabase : " + minByExample().get());

        System.out.println("Student with maximum Gpa in StudentDatabase : " + maxByExample().get());
    }
}

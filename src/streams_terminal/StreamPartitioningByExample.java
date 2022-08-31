package streams_terminal;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//similar to groupingBy just it returns map
public class StreamPartitioningByExample {

    static Predicate<Student> p1 = (student) -> student.getGpa()>3.8;

    public static Map<Boolean, List<Student>> partitioningBy_1(){
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(p1));

    }

    //default return is list in values ading one more parameter to return set
    public static Map<Boolean, Set<Student>> partitioningBy_2(){
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(p1,Collectors.toSet()));

    }
    public static void main(String[] args) {
        System.out.println("Partition By returns Boolean and List of student on basis of Predicate condition : " +
                partitioningBy_1());

        System.out.println("Partition By returns Boolean and Set of student on basis of Predicate condition : " +
                partitioningBy_2());
    }
}

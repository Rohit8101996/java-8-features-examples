package parellelstream;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class ParellelStreamVsSequentialExample2 {

    public static List<String> sequentialStreamPrintListOfActivities()
    {
        Long startTime = System.currentTimeMillis();
        List<String> list = StudentDatabase.getAllStudents().stream()     //Stream<Student>
                .map(Student::getActivities)   //Stream<List<String>>
                .flatMap(List::stream)  //Stream<String>
                .collect(Collectors.toList());
        Long endTime =System.currentTimeMillis();
        System.out.println("Duration taken by sequential Stream to execute : " + (endTime-startTime));
        return list;
    }
    public static List<String> parellelStreamPrintListOfActivities()
    {
        Long startTime = System.currentTimeMillis();
        List<String> list = StudentDatabase.getAllStudents().stream()
                .parallel()//Stream<Student>
                .map(Student::getActivities)   //Stream<List<String>>
                .flatMap(List::stream)  //Stream<String>
                .collect(Collectors.toList());
        Long endTime =System.currentTimeMillis();
        System.out.println("Duration taken by Parellel Stream to execute : " + (endTime-startTime));
        return list;
    }

    public static void main(String[] args) {

        sequentialStreamPrintListOfActivities();
        parellelStreamPrintListOfActivities();
    }
}

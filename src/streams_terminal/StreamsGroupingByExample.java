package streams_terminal;

import data.Student;
import data.StudentDatabase;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//groupingby is like groupby in sql

public class StreamsGroupingByExample {

    //below we are grouping by gender to list of student
    public static Map<String,List<Student>> groupStudentsByGender(){
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));
    }


    public static Map<String,List<Student>> customizedGroupByOnStudentList(){
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa()> 3.8 ? "OUTSTANDING" : "AVERAGE" ));
    }

    //Two Level Group By
    //IT WILL HAVE map as value instead of list
    /*
     we are grouping by grade first and then by gpa
     result is a all list of classes with different grades in their class
     */
    public static Map<Integer,Map<String,List<Student>>> twoLevelGroupBy_1(){

       return StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa()> 3.8 ? "OUTSTANDING" : "AVERAGE")));
    }


    public static Map<Integer,Integer> twoLevelGroupBy_2(){

        return StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                       Collectors.summingInt(Student::getNotebooks)));
    }


    public static Map<String,Integer> twoLevelGroupBy_3(){

        return StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getName,
                        Collectors.summingInt(Student::getNotebooks)));
    }

    //twoLevelGroupBy_3() will print same as test() here as names are not duplicate currently in studentDatabaseList
    public static Map<String,Integer> test(){

        return StudentDatabase.getAllStudents().stream()
                .collect(Collectors.toMap(Student::getName,Student::getNotebooks));
    }

    public static Map<String, Set<Student>> threeLevelGroupBy(){
       return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new,Collectors.toSet()));
    }


    //This will return optional since maxBy return is Optional
    public static Map<Integer,Optional<Student>> twoLevelGroupBy_4_calculatingTopLevelGpaStudentForEachGrade(){

        return StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.maxBy(Comparator.comparing(Student::getGpa))));
    }

    //To avoid optional in output there is collectingAndThen method with Collectors
    public static Map<Integer,Student> twoLevelGroupBy_4_calculatingTopLevelGpaStudentForEachGrade_RemovingOptional(){

        return StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
    }


    public static Map<Integer,Student> twoLevelGroupBy_4_calculatingLowestGpaStudentForEachGrade_RemovingOptional(){

        return StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.collectingAndThen(
                        Collectors.minBy(Comparator.comparing(Student::getGpa)),Optional::get)));
    }

    public static void main(String[] args) {

        groupStudentsByGender().keySet().forEach(System.out::println);
        System.out.println("GroupBy on Gender : " +groupStudentsByGender());

        System.out.println("GroupBy on Gpa customized output : " +customizedGroupByOnStudentList());

        System.out.println("GroupBy on Grade and Customized Gpa : " + twoLevelGroupBy_1());

        System.out.println("GroupBy on Grade with Notebooks in each Grade : " + twoLevelGroupBy_2());

        System.out.println("GroupBy on Name with Notebooks : " + twoLevelGroupBy_3());

        System.out.println("Test : " + test());

        System.out.println("Three level group by  : " + threeLevelGroupBy());

        System.out.println("Top Gpa student for each Grade : " + twoLevelGroupBy_4_calculatingTopLevelGpaStudentForEachGrade());

        System.out.println("Top Gpa student for each Grade removing Optional in Output : " + twoLevelGroupBy_4_calculatingTopLevelGpaStudentForEachGrade_RemovingOptional());

        System.out.println("Lowest Gpa student for each Grade removing Optional in Output : " + twoLevelGroupBy_4_calculatingLowestGpaStudentForEachGrade_RemovingOptional());

    }
}

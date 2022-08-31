package streams_terminal;

import data.Student;
import data.StudentDatabase;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {

    public static void main(String[] args) {

        //WE CAN USE THIS
        List<String> names =StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName) //EXTRA STEP TO MAP TO NEW OUTPUT
                .collect(Collectors.toList());

        List<String> namesList = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList())); //here we did in one line

        Set<String> namesSet = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toSet()));

        System.out.println("names : " + names);

        System.out.println("namesList : "+ namesList);

        System.out.println("namesSet : "+ namesSet);

    }
}

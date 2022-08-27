package stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamMapsExample {

	//map --- convert(transform) one type to another
	//Map in collection and map function with stream are two separate things
	
	public static List<String> namesList(){
		
		return  StudentDatabase.getAllStudents().stream()  //Stream<Student>
				.map(Student::getName)  //Stream<String>
				.map(String::toUpperCase)  //Stream<String>  ->  uppercase operation to each input
				.collect(Collectors.toList());  //List<String>
	}
	
	
public static Set<String> namesSet(){
		
		return  StudentDatabase.getAllStudents().stream()  //Stream<Student>
				.map(Student::getName)  //Stream<String>
				.map(String::toUpperCase)  //Stream<String>  ->  uppercase operation to each input
				.collect(Collectors.toSet());  //Set<String>
	}

	public static void main(String[] args) {
		
		System.out.println(namesList());
		
		System.out.println(namesSet());
	}

}

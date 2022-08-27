package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamComparatorExample {
	
	public static List<Student> sortedListOfStudentByName()
	{
		return StudentDatabase.getAllStudents().stream()     //Stream<Student>
				.sorted(Comparator.comparing(Student::getName))  //sorting student list by name
				.collect(Collectors.toList());
	}
	
	public static List<Student> sortedListOfStudentByGpa()
	{
		return StudentDatabase.getAllStudents().stream()     //Stream<Student>
				.sorted(Comparator.comparing(Student::getGpa))  //sorting student list by name
				.collect(Collectors.toList());
	}
	
	public static List<Student> sortedListOfStudentByGpaDescending()
	{
		return StudentDatabase.getAllStudents().stream()     //Stream<Student>
				.sorted(Comparator.comparing(Student::getGpa).reversed())  //sorting student list by name
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println(sortedListOfStudentByName());
		System.out.println("---------------------------");
		System.out.println(sortedListOfStudentByGpa());
		System.out.println("---------------------------");
		System.out.println(sortedListOfStudentByGpaDescending());
	}

}

package stream;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamFlatMapExample {
	
	public static List<String> printListOfActivities()
	{
		return StudentDatabase.getAllStudents().stream()     //Stream<Student>
				.map(Student::getActivities)   //Stream<List<String>>
				.flatMap(List::stream)  //Stream<String>
				.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		System.out.println(printListOfActivities());
	}
}

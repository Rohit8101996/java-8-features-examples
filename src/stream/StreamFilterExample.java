package stream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class StreamFilterExample {
	
	public static List<Student> filterStudents(){
		
		return StudentDatabase.getAllStudents().stream()
				.filter((student)->student.getGender().equals("female"))
				.filter((student)->student.getGpa()>=3.8)
				.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		filterStudents().forEach(System.out::println);
	}
}

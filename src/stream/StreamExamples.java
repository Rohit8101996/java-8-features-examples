package stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.StudentDatabase;
import data.Student;

public class StreamExamples {
	
	public static void main(String[] args) {
		
		//student name and their activites in a map
		
		Map<String,List<String>> map=StudentDatabase.getAllStudents().stream() //stream method gave output as Stream<Student> for this scenario
				.collect(Collectors.toMap((student)->student.getName(),(student)->student.getActivities()));
		//collect method accepts two parameters both are of functions type functional interface
		
		//using method reference
		Map<String,List<String>> newmap=StudentDatabase.getAllStudents().stream()
				.collect(Collectors.toMap(Student::getName,Student::getActivities));
		
		//if we compare with FunctionFunctionalInterfaceStudentExampleClass 
		//the code is consize than we write in body of functional interface to get output
		
		System.out.println(map);
		
		System.out.println(newmap);
		
		//adding new use case where we want only student which have grade level greater than 3 so for this filter method comes
		
		Map<String,List<String>> newhashmap=StudentDatabase.getAllStudents().stream()
				.filter((student)->student.getGradeLevel()>=3)
				.collect(Collectors.toMap(Student::getName,Student::getActivities));
		
		System.out.println("------------------");
		
		System.out.println(newhashmap);
		
		
		Predicate<Student> p1=(student)->student.getGradeLevel()>=3;
		Predicate<Student> p2=(student)->student.getGpa()>=3.9;
		
		Map<String,List<String>> output=StudentDatabase.getAllStudents().stream()
				.filter(p1.and(p2))
				//.filter(p2)
				.collect(Collectors.toMap(Student::getName,Student::getActivities));
		System.out.println(output);
		
		//Streams are lazy and stream processing starts we have terminal operation defined in pipeline ,above mentioned stream have collect method as their terminal operation
		System.out.println("---------------------");
		//to debug stream operation we have a handy method peek which accepts consumer as parameter .we can invoke it after operation performed in stream
		Map<String,List<String>> output1=StudentDatabase.getAllStudents().stream()
				.peek(s->System.out.println(s))
				.filter(p1)
				.peek(s->System.out.println("after 1st filter: "))
				.filter(p2)
				.peek(s->System.out.println("after 2nd filter: "))
				.collect(Collectors.toMap(Student::getName,Student::getActivities)); //one by one all operation happens to a element in stream i.e., first all the operations are completed for first element then it goes for second element
		
		
		System.out.println(output1);
	
	}
}

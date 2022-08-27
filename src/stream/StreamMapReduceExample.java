package stream;

import java.util.Optional;

import data.Student;
import data.StudentDatabase;

public class StreamMapReduceExample {

	
	public static Optional<Integer> countNotebooks(){
		return StudentDatabase.getAllStudents().stream()  //Stream<Student>
				.map(s1->s1.getNotebooks())  //Stream<Integer>
				.reduce((a,b)->a+b);   //return the sume of notebooks of all students 
		
		//now instead of method instead reduce we can use
		
	}
	
	public static Optional<Integer> countNotebooks1(){
		return StudentDatabase.getAllStudents().stream()  //Stream<Student>
				.filter((s)->s.getGender().equals("female")) // filter can also be done before reduce method performed
				.map(s1->s1.getNotebooks())  //Stream<Integer>
				.reduce(Integer::sum);   //return the sum of notebooks of all students 
		
		//now instead of method instead reduce we can use
		
	}
	public static void main(String[] args) {
		System.out.println(countNotebooks().get());
		System.out.println("Count of Notebooks : " + countNotebooks1().get());
		
	}
}

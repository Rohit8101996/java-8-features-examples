package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import data.Student;
import data.StudentDatabase;

public class StreamReduceFunctionExample {
	
	//reduce--This is a terminal operation and is used to reduce contents of a stream in a single value
	
	/*It takes two parameters as an input 
		-First Parameter- Default or Initial Value
		-Second Parameter - Binary Operator<T>
		*/
	
	public static int performMutliplication(List<Integer> list) {
		
		return list.stream()
				//1
				//3
				//5
				//7
				// 1 in reduce is identity it is initial value ,a=1
				//while b is from stream ,b=1, a*b =1 ,so 1 is returned next cycle a=1 and b=3 ,3 is returned and so on 
			.reduce(1,(a,b)->a*b);
	
	}
	
	public static Optional<Integer> performMutliplicationWithoutIdentity(List<Integer> list) {
		
		return list.stream() 
			.reduce((a,b)->a*b); //without providing identity return type is required optional,by default taken as 1
	
	}
	
	public static Optional<Student> getHighestGpaStudent()
	{
		return StudentDatabase.getAllStudents().stream()
		.reduce((s1,s2)->{
			if(s1.getGpa()>s2.getGpa())
			{
				return s1;
			}
			else
				return s2;
		});
	}
	
	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(1,3,5,7);
		
		System.out.println(performMutliplication(list));
		
		Optional<Integer> ops=performMutliplicationWithoutIdentity(list);
		
		System.out.println(ops.isPresent());
		System.out.println(ops.get());
		
		Optional<Student> studentWithHighestGpa= getHighestGpaStudent();
		
		if(studentWithHighestGpa.isPresent())
			System.out.println(studentWithHighestGpa.get());
	}
	
	


}

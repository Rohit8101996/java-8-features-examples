package data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {
	
	public static Supplier<Student> studentSupplier=()->{
		return new Student("Adam",2,3.6,"male",Arrays.asList("cricket","basketball","football")); 
	};
	
	public static List<Student> getAllStudents()
	{
		Student s1=new Student("Adam",2,3.6,"male",Arrays.asList("cricket","basketball","football"),11);
		Student s2=new Student("Jenny",2,3.8,"female",Arrays.asList("swimming","rugby","football"),12);
		
		Student s3=new Student("Emily",3,3.9,"female",Arrays.asList("cricket","basketball","dancing"),10);
		Student s4=new Student("Dave",3,4.0,"male",Arrays.asList("cricket","basketball","badminton"),9);
		
		Student s5=new Student("Sophia",4,3.7,"female",Arrays.asList("dancing","gymnastics","basketball","football"),15);
		Student s6=new Student("James",4,3.9,"male",Arrays.asList("cricket","basketball","rugby"),14);
		
		List<Student> list=Arrays.asList(s1,s2,s3,s4,s5,s6);
		
		return list;
		
	}

}

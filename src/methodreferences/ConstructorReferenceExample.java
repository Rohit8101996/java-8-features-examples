package methodreferences;

import java.util.function.Function;
import java.util.function.Supplier;

import data.Student;

public class ConstructorReferenceExample {
	
	public static Supplier<Student> s1=Student::new;
	
	public static Function<String, Student> f1=Student::new;
	
	public static void main(String[] args) {
		
		System.out.println(s1.get());
		
		System.out.println(f1.apply("rohit"));
	}
}

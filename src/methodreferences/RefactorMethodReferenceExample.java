package methodreferences;

import java.util.function.Predicate;

import data.Student;
import data.StudentDatabase;

public class RefactorMethodReferenceExample {

	static Predicate<Student> p=(student)-> student.getGpa()>3.8;
	
	static Predicate<Student> p1=RefactorMethodReferenceExample::greaterThanGpa;
			
	public static boolean greaterThanGpa(Student s)
	{
		return s.getGpa()>3.8;
	}
	 public static void main(String[] args) {
		System.out.println(p.test(StudentDatabase.studentSupplier.get()));
	}
}

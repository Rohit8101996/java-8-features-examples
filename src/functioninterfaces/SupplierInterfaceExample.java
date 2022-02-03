package functioninterfaces;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import data.Student;
import data.StudentDatabase;

public class SupplierInterfaceExample {
	
	public static Supplier<Student> supplier=()->
	{
		return new Student("Adam",2,3.6,"male",Arrays.asList("cricket","basketball","football"));
	};
	
	public static Supplier<List<Student>> listStudentSupplier=()->
	{
		return StudentDatabase.getAllStudents();
	};
	
	public static void main(String[] args) {
		System.out.println(supplier.get());
		
		System.out.println(listStudentSupplier.get());
	}
}

package functioninterfaces;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDatabase;




public class ConsumerFunctionalInterfaceExample {
	
	static Consumer<Student> c1=(Student s)-> System.out.println(s);
	static Consumer<Student> c2=(s)-> System.out.print(s.getName());
	static Consumer<Student> c3=(s)-> System.out.println(s.getActivities());
	
	
	public static void printName() {
		
		List<Student> studentList=StudentDatabase.getAllStudents();
		studentList.forEach(c1);
	}
	
	public static void printNameAndActivites() {
		
		List<Student> studentList=StudentDatabase.getAllStudents();
		studentList.forEach(c2.andThen(c3));  //consumer chaining we can perform and then n number of times
		
	}
	
	public static  void printNameAndActivitiesCondition()
	{
		
		List<Student> studentList=StudentDatabase.getAllStudents();
		studentList.forEach(
				(s)-> {
					if(s.getGradeLevel()>=3 && s.getGpa()>=3.9)
					{
						c2.andThen(c3).accept(s);
					}
				}
					);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c=(String s)-> System.out.println(s.toUpperCase());
		c.accept("java8");
		
		//printName();
		printNameAndActivites();
		//printNameAndActivitiesCondition();
		
	}
}

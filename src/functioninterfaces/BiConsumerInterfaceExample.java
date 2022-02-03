package functioninterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import data.Student;
import data.StudentDatabase;

public class BiConsumerInterfaceExample {

	public static void getNameAndActivities()
	{
		List<Student> studentList=StudentDatabase.getAllStudents();
		
		BiConsumer<String, List<String>> c4=(name,activities )-> System.out.println( name + ": " + activities);
		
		studentList.forEach((student)-> c4.accept(student.getName(),student.getActivities()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<String,String> c1= (x,y)->{
			System.out.println(" x : "+ x + "  y : "+ y);
		};
		
		BiConsumer<Integer,Integer> c2= (a,b)->
		{
			System.out.println("multiplication output: "+ (a*b));
		};
		
		BiConsumer<Integer,Integer> c3= (a,b)->
		{
			System.out.println("division output: "+ (a/b));
		};
		
		c1.accept("java7", "java8");
		c2.accept(6,9);
		c2.andThen(c3).accept(10,5);
		getNameAndActivities();
	}

}

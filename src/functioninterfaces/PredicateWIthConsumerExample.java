package functioninterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import data.Student;
import data.StudentDatabase;

public class PredicateWIthConsumerExample {

	 Predicate<Student> p1=(student)->student.getGpa()>=3.9;
	 Predicate<Student> p2=(student)->student.getGradeLevel()>=3;
	
	 BiConsumer<String,List<String>> b1=(name,activities)->System.out.println(name + " :" +activities);
	
	 Consumer<Student> c=(student)->{
		
		if(p1.and(p2).test(student))
		{
		b1.accept(student.getName(),student.getActivities());
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList=StudentDatabase.getAllStudents();
		PredicateWIthConsumerExample predicateWIthConsumerExample=new PredicateWIthConsumerExample();
		
		studentList.forEach(predicateWIthConsumerExample.c);

	}
	
}

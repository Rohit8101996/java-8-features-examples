package functioninterfaces;


import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

import data.Student;
import data.StudentDatabase;

public class BiPredicateFunctionInterfaceExample {
	
	static BiPredicate<Integer,Double> bp1=(gradeLevel,gpa)->gradeLevel>=3 && gpa>=3.9;
	
	 static BiConsumer<String,List<String>> bc1=(name,activities)->System.out.println(name + " : " +activities);
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList=StudentDatabase.getAllStudents();
		
		studentList.forEach((student)->
		{
			if(bp1.test(student.getGradeLevel(),student.getGpa()))
			{
				bc1.accept(student.getName(), student.getActivities());
			}
		});
	}

}

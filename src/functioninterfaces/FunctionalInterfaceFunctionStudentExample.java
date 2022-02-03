package functioninterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import data.Student;
import data.StudentDatabase;

public class FunctionalInterfaceFunctionStudentExample {

	public static Function<List<Student>,Map<String,Double>> studentFunctionExample=(students)->
	{
		Map<String,Double> newStudentHashMap=new HashMap<String, Double>();
		
		students.forEach((student)->
		{
			if(PredicateStudentExample.p.test(student))
			newStudentHashMap.put(student.getName(), student.getGpa());
		});
		
		return newStudentHashMap;
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList=StudentDatabase.getAllStudents();
		
		System.out.println(studentFunctionExample.apply(studentList));

	}

}

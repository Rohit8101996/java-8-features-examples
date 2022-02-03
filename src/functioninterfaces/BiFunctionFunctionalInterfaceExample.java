package functioninterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import data.Student;
import data.StudentDatabase;

public class BiFunctionFunctionalInterfaceExample {
	
	
	static BiFunction<List<Student>,Predicate<Student>,Map<String,Double>> biFunction=(students,studentPredicate)->
	{
		Map<String,Double> map=new HashMap<String,Double>();
		students.forEach((student)->
		{
			if(studentPredicate.test(student))
				map.put(student.getName(), student.getGpa());
		});
		return map;
	};
	public static void main(String[] args) {
		
//		Predicate<Student> p1= (student)->student.getGpa()>3.8 && student.getGradeLevel()>=3 ;
//		
//		Map<String,Double> map=biFunction.apply(StudentDatabase.getAllStudents(), p1);
//		
//		System.out.println(map);
		
		System.out.println(biFunction.apply(StudentDatabase.getAllStudents(), PredicateStudentExample.p1));
	}

}

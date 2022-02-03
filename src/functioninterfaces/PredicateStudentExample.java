package functioninterfaces;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.StudentDatabase;

public class PredicateStudentExample {

	static Predicate<Student> p=(student)-> student.getGpa()>3.8;
	static Predicate<Student> p1=(student)->student.getGradeLevel()>3;
	
	static List<Student> studentList=StudentDatabase.getAllStudents();
	
	public static void  filterStudentByGpa()
	{
		studentList.forEach((student)
				->{
					if(p.test(student))
						System.out.println(student);
				});
	}
	
	public static void  filterStudentByGradeLevel()
	{
		studentList.forEach((student)
				->{
					if(p1.test(student))
						System.out.println(student);
				});
	}
	public static void  filterStudentByGradeLevelAndGpa()
	{
		studentList.forEach((student)
				->{
					if(!p.and(p1).test(student)  || p.and(p1).negate().test(student)) //both are same conditions it is just we check one with negate and other with not but both uses lambda expression of Predicate
						System.out.println(student);
				});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filterStudentByGpa();
		System.out.println("-----------------------------");
		filterStudentByGradeLevel();
		System.out.println("-----------------------------");
		filterStudentByGradeLevelAndGpa();
	}

}

package stream;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class DistinctCountAndSortedStreamFunctionExample {
	public static List<String> printListOfActivitiesDistinct()
	{
		return StudentDatabase.getAllStudents().stream()     //Stream<Student>
				.map(Student::getActivities)   //Stream<List<String>>
				.flatMap(List::stream)  //Stream<String>
				.distinct() //for getting every activity only once Stream<String> -- unique results
				.sorted()  //sort data in ascending order
				.collect(Collectors.toList());
	}
	
	public static Long printListOfActivitiesCount()
	{
		return StudentDatabase.getAllStudents().stream()     //Stream<Student>
				.map(Student::getActivities)   //Stream<List<String>>
				.flatMap(List::stream)  //Stream<String>
				.distinct() //for getting every activity only once
				.count();
	}
	
	public static void main(String[] args) {
		System.out.println("Distinct list of actvities: " + printListOfActivitiesDistinct());
		
		System.out.println("Total number of activites: "+ printListOfActivitiesCount());
	}
}

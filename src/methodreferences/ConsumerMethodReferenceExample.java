package methodreferences;

import java.util.function.Consumer;

import data.Student;
import data.StudentDatabase;

public class ConsumerMethodReferenceExample {

	static Consumer<Student> consumerLambdaExample=(s)->System.out.println(s);
	
	//className::methodName
	static Consumer<Student> consumerMethodReference=System.out::println;
	
	//className::instanceMethodName
	static Consumer<Student> consumerwithMethodReference=Student::printListOfActivities;
	public static void main(String[] args) {
		StudentDatabase.getAllStudents().forEach(consumerLambdaExample);
		System.out.println("----------------------");
		StudentDatabase.getAllStudents().forEach(consumerMethodReference);
		System.out.println("---------------------");
		StudentDatabase.getAllStudents().forEach(consumerwithMethodReference);
		
	}
}

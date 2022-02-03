package methodreferences;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
	
	static Function<String,String> toUpperCaseLambda=(a)->a.toUpperCase();
	
	static Function<String,String> toUpperCaseMethodReference=String::toUpperCase ;
	
	public static void main(String[] args) {
		System.out.println(toUpperCaseLambda.apply("rohit"));
		
		System.out.println(toUpperCaseMethodReference.apply("java8"));
	}
}

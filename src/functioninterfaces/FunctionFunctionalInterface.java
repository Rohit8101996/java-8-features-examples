package functioninterfaces;

import java.util.function.Function;

public class FunctionFunctionalInterface {

	static Function<Integer, Integer> f1=(a)->a*a;
	
	static Function<String,String> f2=(name)->name.toUpperCase();
	
	static Function<String,String> f3=(s)->s.concat(" Baranwal");
	
	static Function<String,String> f4=(s)->s.toLowerCase();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(f1.apply(6));
		
		System.out.println("Result of using Apply: " + f2.apply("rohit"));
		
		System.out.println("Result of using and then: "+ f2.andThen(f3).apply("rohit")); //first it will perform f2 and then go for f3 it will also take output of f2 to input of f3
		
		System.out.println("Result of using compose: "+ f2.compose(f3).apply("rohit")); //first it will perform f3 and then it go for f2 that too it will take output of f3 as input to f2
		
		System.out.println("Result of using compose more than once: "+ f4.compose(f2).compose(f3).apply("rohit"));
	}

}

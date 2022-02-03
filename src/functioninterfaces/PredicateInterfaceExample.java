package functioninterfaces;

import java.util.function.Predicate;

public class PredicateInterfaceExample {

	static Predicate<Integer> predicate= (a)-> { return  a%2==0;};
	
	static Predicate<Integer> predicate1= (a)->  a%3==0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(predicate.test(3));
		System.out.println(predicate1.test(4));
		
		System.out.println("AND CONDITION: " + predicate.and(predicate1).test(6)); //it is predicate chaining
		
		System.out.println("OR CONDITION: " + predicate.or(predicate1).test(7)); //  result of  predicate and  predicate1 as OR OPERATION   
		
		System.out.println("Negate Method: " + predicate.negate().test(4));
	}
}

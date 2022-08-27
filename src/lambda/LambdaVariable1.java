package lambda;

import java.util.function.Consumer;

public class LambdaVariable1 {
	
	//Lambdas and Local Variable
	
	/* What is a local variable?
	 * 
	 * Any variable that is declared inside a method is local variable
	 * 
	 * Lambdas have some restrictions on using local variables
	 * 
	 * Not allowed to use the same the local variable name as lambda parameters or inside the lambda body
	 * 
	 * Not allowed re-assign a value to a local variable
	 * 
	 * No restrictions on instances variables
	 */
	public static void main(String[] args) {
		
		int i=0;
		
		
		Consumer<Integer> c1=(i1 // i as variable name cannot be used in lambda as it already a local variable of main method,so changing to i1 or something else
				)->{
					 //int i=1; this we cannot  define here as allready i is there in local scope of main
			System.out.println("value is: " + i1);
		};
		
		c1.accept(8);
		
	}

}

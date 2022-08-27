package lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {

	static int value2=8;
	
	public static void main(String[] args) {
		int value=4; //local variable 
		Consumer<Integer> c1=(i)->{
			//value++;    cannot modify any in local variable in lambda
			value2++;
			System.out.println(value+ i+value2);
		};
		
		//value=6; this cannot be done since it is being referenced inside lambda function .it is effectively final
		c1.accept(2);
	}
	/*Prior to java 8 any variable used inside anonymous class should be declared  final*/
	
	/* advantages 
	 * ----easy to use in concurrency operations 
	 * ----promotes declarative programming over imperative style of programming
	 */
}

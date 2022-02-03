package functioninterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	static UnaryOperator<String> operation=(s)->s.concat(" world" );
	
	public static void main(String args[])
	{
		System.out.println(operation.apply("hello"));
	}
}

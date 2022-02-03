import java.util.stream.IntStream;

public class PorgramOne {

	public static void main(String[] args) {
		// Imperative Style of programming
		int sum1=0,sum2=0;
		for(int i=0;i<=100;i++)
		{
			sum1 += i;
		}
		System.out.println("sum using imperative approach: "+sum1);
		//declarative style of programming 
		
		sum2=IntStream.rangeClosed(0, 100).sum();
		System.out.println("sum using declarative approach: " + sum2);
	}

}

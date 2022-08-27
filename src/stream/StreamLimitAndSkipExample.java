package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/* Limit and Skip function is use
 * 					These two functions helps to create sub stream
 *  		---- 1. limit(n) -> limits the "n" number of elements to be  processed in stream
 *  		---- 2. skip(n) ->  skips the "n" number of elements from the stream
 *
 */
public class StreamLimitAndSkipExample {

	public static Optional<Integer> totalValueWithLimit(List<Integer> intList){
		return intList.stream()
				.limit(2) //It will limit stream to first two values i.e., 6 and 8 
				.reduce((a,b)->a+b);
	}
	
	public static Optional<Integer> totalValueWithSkip(List<Integer> intList){
		return intList.stream()
				.skip(2) //It will skip stream for first two values i.e., 6 and 8 
				.reduce((a,b)->a+b);
	}
	public static void main(String[] args) {
		
		List<Integer> intList= Arrays.asList(6,8,9,12);
		if(totalValueWithLimit(intList).isPresent())
			System.out.println("limit  add " +totalValueWithLimit(intList).get());
		else
			System.out.println("No list is passed");
		
		if(totalValueWithSkip(intList).isPresent())
			System.out.println("skip  add " +totalValueWithSkip(intList).get());
		else
			System.out.println("No list is passed");
	}
}

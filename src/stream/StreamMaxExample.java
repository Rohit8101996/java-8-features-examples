package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {
	
	
	public static int findMax(List<Integer> intList) {
		
		//4
		//5
		//6
		//7
		//8
		//after each iteration for reduce max will updated and x holds max after each iteration
		int result= intList.stream().reduce(0,(x,y)->x>y?x:y);
		return result;
		
	}
	
	public static Optional<Integer> optionalFindMax(List<Integer> intList) {
		return  intList.stream().reduce((x,y)->x>y?x:y);
		
	}
	public static void main(String[] args) {
		
		//List<Integer> integerList =Arrays.asList(4,5,6,7,8);
		//if we pass empty to first function mentioned above findmax it will still return max as 0 which is incorrect right 
		//for that we have optional
		List<Integer> integerList=new ArrayList<>();
		System.out.println("max in the list "+findMax(integerList));
		if(optionalFindMax(integerList).isPresent())
		{
		System.out.println("max in the optional list "+optionalFindMax(integerList).get());
		}
		else {
			System.out.println("No value present in list");
		}
	}

}

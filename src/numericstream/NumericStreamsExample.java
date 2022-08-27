package numericstream;

import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    public static int sumOfNNumbers(List<Integer> list){
        return list.stream()
                .reduce(0,(x,y)->x+y);  //this everytime does unboxing of Integer to int
    }

    public static int sumOfNNumbersIntStream(){
       return IntStream.rangeClosed(0,6)
               //this will pass 0
               //then 1
               //then 2
               //then 3
               //then 4
               //then 5 and then 6
               .sum();
    }
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        System.out.println("Sum of N numbers: "+ sumOfNNumbers(list));

        System.out.println("Sum of N numbers using Intstream: "+ sumOfNNumbersIntStream());
    }
}

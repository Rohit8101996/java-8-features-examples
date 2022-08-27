package numericstream;


import com.sun.jdi.connect.ListeningConnector;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingAndUnboxingExample {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                .boxed() //Converting int to Integer to process for list
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> integerList){
        //wrapper to primitive
       return integerList.stream()
                //Integer to int
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static void main(String[] args) {
        System.out.println("Boxing : "+ boxing());
        System.out.println("Sum of numbers in list: "+ unboxing(boxing()));
    }
}

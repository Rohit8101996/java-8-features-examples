package numericstream;

import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1,5)
                .mapToObj((i)->
                {
                   return new Integer(i);  //Here we can have custom objects
                }).collect(Collectors.toList());
    }

    public static long mapToLong(){
        return IntStream.rangeClosed(1,5)
                //i is passed from intStream
                .mapToLong((i)->i) //Here we covert intStream to longStream
                 .sum();
    }

    public static Double mapToDouble(){
        return IntStream.rangeClosed(1,5)
                .mapToDouble((i)->i) //Here we covert intStream to DoubleStream
                .sum();
    }
    public static void main(String[] args) {
        System.out.println("map to obj: "+ mapToObj());

        System.out.println("map to long(test sum): "+ mapToLong());

        System.out.println("map to Double(test sum): "+ mapToDouble());
    }
}

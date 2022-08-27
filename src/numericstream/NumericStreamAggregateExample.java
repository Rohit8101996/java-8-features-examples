package numericstream;

import java.net.StandardSocketOptions;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {

        System.out.println("Sum of first 50 numbers is: " +IntStream.rangeClosed(1,50).sum());

        System.out.println("Max value in range provided: "+ ((IntStream.rangeClosed(1,50).max().isPresent())?IntStream.rangeClosed(1,50).max().getAsInt():0));

        System.out.println("Min value in range provided: " + LongStream.rangeClosed(1,50).min().getAsLong());

        System.out.println("Average of numbers in range provided: " + IntStream.rangeClosed(1,50).average().getAsDouble());
    }
}

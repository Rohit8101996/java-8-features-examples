package numericstream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {

        IntStream intStream=IntStream.range(1,50);
        System.out.println("Range Count: "+ intStream.count());
        //Below line will give error since stream is already processed
        //intStream.forEach((i)-> System.out.print(i));

        IntStream.range(1,50).forEach((i)-> System.out.print(i + ","));

        System.out.println("\nRange Closed Count: " +IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach((i)-> System.out.print(i +","));

        System.out.println("\nLong Range Count: " + LongStream.range(1,50).count());
        LongStream.range(1,50).forEach((i)-> System.out.print(i +","));


        System.out.println("\nLong Range Closed Count: " +LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach((i)-> System.out.print(i +","));

       //DoubleStream doesnot support range and rangeClosed method
        //So to use it converting Intstream to doublestream
        //asDoubleStream method is present in both IntStream and LongStream
        System.out.println("\nDouble Stream Range Closed Count: " +IntStream.rangeClosed(1,50).asDoubleStream().count());
        IntStream.rangeClosed(1,50).asDoubleStream().forEach((i)-> System.out.print(i +","));

    }
}

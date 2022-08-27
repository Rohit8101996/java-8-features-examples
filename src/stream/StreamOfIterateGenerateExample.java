package stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfIterateGenerateExample {

    public static void main(String[] args) {

        //Another way to create stream object
        Stream<String> stringStream = Stream.of("julie","adam","marc");
        stringStream.forEach(System.out::println);

        Stream.iterate(1,x->x*2)  //This is will continue to infinite times if limit is not applied
                .limit(5)
                .forEach(System.out::println);

        Supplier<Integer> integerSupplier=new Random()::nextInt;

        Stream.generate(integerSupplier)  //It will continue to infinite times if limit is not applied
                .limit(5)
                .forEach(System.out::println);
    }
}

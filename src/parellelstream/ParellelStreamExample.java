package parellelstream;

import java.util.stream.IntStream;

public class ParellelStreamExample {

    public static int sumSequentialStream(){
        return IntStream.rangeClosed(1,100000)
                .sum();
    }

    public static int sumParellelStream(){
        return IntStream.rangeClosed(1,100000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Sum from Sequential Stream : " + sumSequentialStream());

        System.out.println("Sum from parellel Stream : " + sumParellelStream());
    }
}

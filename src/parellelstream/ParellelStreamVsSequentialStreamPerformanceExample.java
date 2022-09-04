package parellelstream;

import java.time.Instant;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParellelStreamVsSequentialStreamPerformanceExample {


    //Parellel Stream works better with larger input here
    // Changing the value of total numbers for sum is increased from 1lakh to 10lakh
    //parellel stream works better
    // but sequential works better till 1 lakh
    //Constraint is no of times i tried with 100
    //as soon as i changed no of times to 1000 parellel stream started giving better responses with same 1 lakh input
    //Keeping times as 15 as noOfTimes here now and sum of 10 lakh values
    public static long performanceCheck(Supplier<Integer> supplier, int noOfTimes){

        long startTime =System.currentTimeMillis();
        for(int i=0;i<noOfTimes; i++){
            supplier.get();
        }
        long endTime =System.currentTimeMillis();
        return endTime-startTime;
    }
    public static int sumSequentialStream(){
        return IntStream.rangeClosed(1,1000000)
                .sum();
    }

    public static int sumParellelStream(){
        return IntStream.rangeClosed(1,1000000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Sum from Sequential Stream : " + sumSequentialStream());

        System.out.println("Sum from parellel Stream : " + sumParellelStream());


        System.out.println("Performance of Sequential Stream : " + performanceCheck(ParellelStreamVsSequentialStreamPerformanceExample::sumSequentialStream
                ,15) );

        System.out.println("Performance of Parellel Stream : " + performanceCheck(ParellelStreamVsSequentialStreamPerformanceExample::sumParellelStream,
                15));
    }
}

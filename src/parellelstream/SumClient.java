package parellelstream;

import java.util.stream.IntStream;

public class SumClient {

    public static void main(String[] args) {

        Sum sum = new Sum();

        IntStream.rangeClosed(1,1000)
                .forEach(sum::totalSum);

        //For sequential it will call totalSum method for every input one by one
        System.out.println(sum.total);  //Output --> 500500

        IntStream.rangeClosed(1,1000).parallel()  //This will return different output everytime since there
                //totalSum method is called concurrently
                //You will get output more than 500500 this is because total is already having 500500 stored after one process
                //from sequential stream
                .forEach(sum::totalSum);

        System.out.println(sum.total);
    }
}

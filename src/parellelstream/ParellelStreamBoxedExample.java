package parellelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParellelStreamBoxedExample {

    public static int sequentialSum(List<Integer> integerList){

        long startTime =System.currentTimeMillis();
        int sum = integerList.stream()
                .reduce(0, (x,y) -> x+y);
        long duration = System.currentTimeMillis() -startTime;
        System.out.println("Duration to execute Sequential Sum : " + (duration));
        return sum;
    }


    public static int parellelSum(List<Integer> integerList){

        long startTime =System.currentTimeMillis();
        int sum = integerList.parallelStream()
                .reduce(0, (x,y) -> x+y);
        long duration = System.currentTimeMillis() -startTime;
        System.out.println("Duration to execute Parellel Sum : " + (duration));
        return sum;
    }

    public static void main(String[] args) {
        //for small range sequential gives better result
        //for larger range parellel gives better result
        List<Integer> integerList = IntStream.rangeClosed(0,100)
                .boxed()
                .collect(Collectors.toList());

        sequentialSum(integerList);
        parellelSum(integerList);
    }
}

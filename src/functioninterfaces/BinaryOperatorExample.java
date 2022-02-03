package functioninterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comparator=(a,b)->a.compareTo(b);

	public static void main(String[] args) {

		BinaryOperator<Integer> binaryOperation=(a,b)->a*b;

		System.out.println(binaryOperation.apply(2, 3));

		BinaryOperator<Integer> maxBy=BinaryOperator.maxBy(comparator);

		System.out.println("result of maxBy: " + maxBy.apply(3, 4));


		BinaryOperator<Integer> minBy=BinaryOperator.minBy(comparator);

		System.out.println("result of minBy: " + minBy.apply(3, 4));
	}

}

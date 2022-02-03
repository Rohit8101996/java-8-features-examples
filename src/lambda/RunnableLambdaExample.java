package lambda;

public class RunnableLambdaExample  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prior Java 8
		Runnable r1 =new Runnable() {

			@Override
			public void run() {
				System.out.println("inside runnable");
				
			}
		};
		//After Java 8
		Runnable r2 = () -> 	System.out.println("example with runnable");
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		new Thread(()->System.out.println("another way of lambda expression")).start();
		t1.start();
		t2.start();
		
		//for lambdas
		// ()-> single statement or expression; // curly braces not needed
		//()->{ <multiple statement> }; //braces are required
	}

}

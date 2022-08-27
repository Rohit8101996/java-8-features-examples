package defaultpackage;

class TestCallRun1 extends Thread{  
	
	public synchronized void run(){ 
		
		for(int i=0;i<5;i++) {
			System.out.println("running..." +i);
		}
	}  
	
	public static void main(String args[]){  
		TestCallRun1 t1=new TestCallRun1();  
		TestCallRun1 t2=new TestCallRun1();  
		t1.start();
		t2.start();

	}  
} 


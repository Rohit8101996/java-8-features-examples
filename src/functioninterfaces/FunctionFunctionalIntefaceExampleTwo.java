package functioninterfaces;

public class FunctionFunctionalIntefaceExampleTwo {
	
	public static String functionInterfaceExample(String provided)
	{
		return FunctionFunctionalInterface.f2.apply(provided);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(functionInterfaceExample("hello"));
	}

}

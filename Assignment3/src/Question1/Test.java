package Question1;

public class Test implements TestInterface{

	@Override
	public void nonStaticMethod(String str) {
		// TODO Auto-generated method stub
		System.out.println(str); 
	}
	 public static void main(String[] args)   { 
	      Test classDemo = new Test(); 
	 
	     
	      TestInterface.static_print(); 
	      classDemo.nonStaticMethod("TestClass:nonStaticMethod ()");
}
}

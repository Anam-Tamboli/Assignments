package Question2;

public class Division  extends TestAbstraction {

	@Override
	void evaluate(int a, int b) {
		// TODO Auto-generated method stub
		int d=a/b;
		System.out.println("Division is--"+d);
	}
public static void main(String args[])
{
	Addition a=new Addition();
	Subtraction s=new Subtraction();
	Multiplication m=new Multiplication();
	Division d=new Division();
	a.evaluate(10,10);
	s.evaluate(50,20);
	m.evaluate(5,5);
	d.evaluate(9,3);
}
}

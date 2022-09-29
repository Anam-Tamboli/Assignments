/*Create 2 functional interfaces by 2 different ways.*/
package Question1;
@FunctionalInterface
interface Demo{
	int cal(int num);
}
public class Main {
	public static void main(String args[]) {
		Demo solution=(int num)->num+25;
		System.out.println("ans="+solution.cal(25));
	}

}

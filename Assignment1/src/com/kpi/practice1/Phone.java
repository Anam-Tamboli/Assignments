/*Write a program to demonstrate abstraction and encapsulation*/
package com.kpi.practice1;

public class Phone extends Appliances{

	@Override
	void PhoneCover() {
		// TODO Auto-generated method stub
		System.out.println("Attached");
	}

	@Override
	void DisplayScreen() {
		// TODO Auto-generated method stub
		System.out.println("On-Off");
	}
	public static void main(String args[])
	{
		Phone p1= new Phone();
		p1.PhoneCover();
		p1.DisplayScreen();
	}
}
/*Can we create an object of an abstract class? Justify your answer with coding example.

No, we can't create an object of an abstract class.

Example:
  
         abstract class Diagram{
}

Here we cannot create oject of diagram class.
*/

/* Write a program to demonstrate inheritance and abstraction.*/
package com.kpi.practice1;

public class Lion extends Animal{

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Roar Roar");
	}
	public static void main(String args[])
	{
		Lion l1= new Lion();
		l1.makeSound();
		l1.eat();
	}

}

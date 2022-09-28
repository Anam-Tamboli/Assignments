package com.kpi.practice2;

public class Cat implements Animal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Meow-Meow");
	}
	public void eat() {
		System.out.println("Drink Milk");
	}
	public static void main(String args[])
	{
		Cat c1=new Cat();
		Dog d1=new Dog();
		
	}
}

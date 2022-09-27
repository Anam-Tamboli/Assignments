/*Write a program to demonstrate encapsulation. Create 3 constructors of the same class and use them to create 5 objects. 
*/

package com.kpi.practice1;

public class Student {

	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("I am Student");
	}
	    int id;
	    String name;
		int phone_no;
		String address;
		Student(int i, String n)
		{
			id=i;
			name=n;
		}
		Student(int i, String a,int x)
		{
			id=i;
			address=a;
			phone_no=x;
		}
		Student(int i,int x){
			id=i;
			phone_no=x;
		}
		void display()
		{
			System.out.println(id+""+name+""+phone_no+""+address);
		}
		public static void main(String args[]) {
			Student s1=new Student(101,"Anam");
			Student s2=new Student(101,"Mahrashtra",123455);
			Student s3=new Student(101,123455);
			Student s4=new Student(102,"Tamboli");
			Student s5=new Student(102,024156);
			s1.display();
			s2.display();
			s3.display();
			s4.display();
			s5.display();
		}
		}



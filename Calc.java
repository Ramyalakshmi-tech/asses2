package com.asses2;
class Addoperation extends Thread{
	int x,y;
	public Addoperation(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public void run() {
		try {
			System.out.println("Addition is");
			System.out.println(x+y);
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Suboper extends Thread{
	int x,y;
	public Suboper(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public void run() {
	try {
		System.out.println("Subtraction  is");
		System.out.println(x-y);
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
}
class Multi extends Thread{
	int x,y;
	public Multi(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public void run() {
	try {
		System.out.println("Multiplication  is");
		System.out.println(x*y);
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
}
class Divide extends Thread{
	int x,y;
	public Divide(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public void run() {
	try {
		System.out.println("Division  is");
		System.out.println(x/y);
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
}

public class Calc {
	public static void main(String[] args) {
	Addoperation obj=new Addoperation(1,5);
	Suboper obj1=new Suboper(8,6);
	Multi obj2=new Multi(4,5);
	Divide obj3=new Divide(7,5);
	obj.start();
	obj1.start();
	obj2.start();
	obj3.start();
	 
	}

}

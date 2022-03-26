package com.asses2;

 class ThreadExam extends Thread{
	int x;
	public ThreadExam(int x) {
		this.x=x;
	}
	@Override
	public void run() {
		try {
			if(x%8==0) {
				System.out.println("Divisible by 8 ");
			}
			else {
				System.out.println("notDivisible by 8 ");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
class Even extends Thread{
	int x;
	public Even(int x) {
		this.x=x;
	}
	@Override
	public void run() {
		try {
			if(x%2==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
			}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Prime extends Thread{
	public void run() {
		int n=0;
		String primeNumbers=" ";
		try {
			for(int i=2;i<500;i++) {
				int count=0;
						for(n=i;n>=1;n--) {
							if(i%n==0) {
								count=count+1;
							}
						}
						if(count==2) {
							primeNumbers=primeNumbers+i+" ";
						}
					
			}
			System.out.println(primeNumbers);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class PrimeCheck extends Thread{
	int x;
	public PrimeCheck(int x) {
		this.x=x;
	}
	@Override
	public void run() {
		try {
			if(x==0||x==1) {
				int flag=1;
				for(int i=2;i<x/2;++i) {
					if(x%i==0) {
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.println("prime");
				}
				else {
					System.out.println("not a prime");
				}
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}

public class ThreadExampl{
	public static void main(String[] args) {
		ThreadExam obj1=new ThreadExam(4);
		obj1.start();
		Even obj2=new Even(7);
		obj2.start();
		Prime obj3=new Prime();
		obj3.start();
		PrimeCheck obj4=new PrimeCheck(56);
		obj4.start();
	}
}





























package com.asses2;

public class ThreadDemo implements Runnable 
{
public void run() {
	System.out.println("Thread Executed");
}
public static void main(String[] args) {
	ThreadDemo d=new ThreadDemo();
	Thread obj=new Thread(d);
	
	obj.start();
}
}

package com.asses2;

 class Program extends Thread {
	public void run() {
		try {
			System.out.println("Hey Ramya,I m a thread"+Thread.currentThread().getId());
		}
		catch(Exception e) {
			System.out.println(e);
		
		}
	}

}
 public class Programs{
	 public static void main(String[] args) {
		 for(int i=1;i<=10;i++) {
		 Program p=new Program();
		 p.start();}
	 }
	
}
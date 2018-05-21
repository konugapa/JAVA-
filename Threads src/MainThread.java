package com.threadswithfile;

public class MainThread extends MyRunnable1 {


	public static void main(String[] args) {

		
		Thread t1 = new Thread(new MyRunnable1());
		t1.start();
		Thread t2 = new Thread(new MyRunnable2()); 
		t2.start(); 
		Thread t3 = new Thread(new MyRunnable3()); 
		t3.start();
		Thread t4 = new Thread(new MyRunnable4()); 
		t4.start(); 
		Thread t5 = new Thread(new MyRunnable5()); 
		t5.start();
		

	}

}

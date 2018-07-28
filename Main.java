package com.thread;

class Main{
	
	public static void main(String args[]) {
		Thread obj = new Thread(new ThreadUsingInterface());
		obj.start();
		for(int i=1; i<=5; i++) {
			System.out.println("In Main thread");
		}
	}
	
}

class ThreadUsingInterface implements Runnable{

	
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			System.out.println("In thread");
		}
	}
}

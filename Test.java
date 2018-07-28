package com.thread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadUsingClassA obj1 = new ThreadUsingClassA();//Thread is in newborn stage
		ThreadUsingClassB obj2 = new ThreadUsingClassB();//Thread is in newborn stage
		
		obj1.start();//thread goes to runnable state
		obj2.start();//thread goes to runnable state
	}

}
class ThreadUsingClassA extends Thread{

	public void run(){
		for(int i=1; i<=5; i++) {
			System.out.println("Thread from A " +i);
		}
		System.out.println("Exit from A");
		
	}
	
}

class ThreadUsingClassB extends Thread{
	
	public void run(){
		for(int i=1; i<=5; i++) {
			System.out.println("Thread from B " +i);
		}
		System.out.println("Exit from B");
		
	}

}



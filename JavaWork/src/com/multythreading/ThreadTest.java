package com.multythreading;

public class ThreadTest {

	public static void main(String[] args) {
		FirstRunnable runnable1=new FirstRunnable("thread1");
		Thread t=new Thread(runnable1);
		
t.start();
FirstRunnable runnable2=new FirstRunnable("thread2");
Thread t1=new Thread(runnable2);

t1.start();
	}

}

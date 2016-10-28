package com.multythreading;

public class FirstRunnable implements Runnable {
	private String threadName;
	public FirstRunnable(String name){
		this.threadName=name;
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++){
			System.out.println("This is Runnable Interface:run method:"+i+ "using thread" + threadName);
		}
		
	}
	

}

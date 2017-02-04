package com.hzm.basic.thread.one;

public class MyThread extends Thread{

	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(getName()+":"+i);
		}
	}
}

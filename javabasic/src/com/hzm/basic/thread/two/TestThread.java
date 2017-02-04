package com.hzm.basic.thread.two;

public class TestThread {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		Thread t2 = new Thread(mt);
		
		t.start();
		t2.start();
	}
}

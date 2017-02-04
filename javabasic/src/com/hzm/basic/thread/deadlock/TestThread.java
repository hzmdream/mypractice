package com.hzm.basic.thread.deadlock;

public class TestThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread(true);
		Thread t = new Thread(mt,"卫庄");
		MyThread mt2 = new MyThread(false);
		Thread t2 = new Thread(mt2,"盖聂");
		
		t.start();
		t2.start();
	}
}

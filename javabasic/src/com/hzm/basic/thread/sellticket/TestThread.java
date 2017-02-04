package com.hzm.basic.thread.sellticket;

public class TestThread {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"卫庄");
		Thread t2 = new Thread(mt,"盖聂");
		Thread t3 = new Thread(mt, "伏念");
		t.start();
		t2.start();
		t3.start();
	}
}

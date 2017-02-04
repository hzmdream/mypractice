package com.hzm.basic.thread.one;

public class TestThread {

	public static void main(String[] args) {
		MyThread myThread1 = new MyThread("FirstDoor");
		MyThread myThread2 = new MyThread("SecondDoor");
		myThread1.start();
		myThread2.start();
	}
}

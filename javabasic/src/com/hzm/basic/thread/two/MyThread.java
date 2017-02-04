package com.hzm.basic.thread.two;

public class MyThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}

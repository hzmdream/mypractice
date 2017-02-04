package com.hzm.basic.thread.pool;

public class MyThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}

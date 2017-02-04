package com.hzm.basic.thread.group;

public class MyThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getThreadGroup().getName()+"--"+Thread.currentThread().getName()+"--"+i);
		}
	}

}

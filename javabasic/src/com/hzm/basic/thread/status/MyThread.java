package com.hzm.basic.thread.status;

public class MyThread implements Runnable{

	@SuppressWarnings("static-access")
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			//线程休眠
//			try {
//				Thread.currentThread().sleep(10000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}

}

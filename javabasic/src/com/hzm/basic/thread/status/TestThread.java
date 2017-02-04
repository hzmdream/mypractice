package com.hzm.basic.thread.status;

public class TestThread {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"卫庄");
		Thread t2 = new Thread(mt,"盖聂");
		
		//后台线程
//		t.setDaemon(true);//必须在启动线程前调用
		t.start();
		//线程礼让
//		t.yield();
		//线程加入
		/*try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		//线程终止
		/*try {
			Thread.sleep(3000);
//			t.stop();
			t.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		t2.start();
	}
}

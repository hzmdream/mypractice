package com.hzm.basic.thread.group;

public class TestGroup {

	public static void main(String[] args) {
		
		//创建线程组
		ThreadGroup tg = new ThreadGroup("墨家");
		ThreadGroup tg2 = new ThreadGroup("儒家");
		
		//创建线程
		MyThread mt = new MyThread();
		Thread t1  = new Thread(tg,mt,"高渐离");
		Thread t2  = new Thread(tg,mt,"太子丹");
		
		Thread t11  = new Thread(tg2,mt,"伏念");
		Thread t21  = new Thread(tg2,mt,"张良");
		
		t1.start();
		t2.start();
		
		//通过组设置线程为后台线程
		tg.setDaemon(true);
		
		t11.start();
		t21.start();
	}
}

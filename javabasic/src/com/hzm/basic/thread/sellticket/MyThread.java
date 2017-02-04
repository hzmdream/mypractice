package com.hzm.basic.thread.sellticket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread implements Runnable{
	
	private static  int ticketNum = 100;
	private Object obj = new Object();
	private Lock lock = new ReentrantLock();
	@Override
	public void run() {
		
		while (true) {
			//同步代码块
			/*synchronized(obj){
				if (ticketNum>0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"正在出售：第"+(ticketNum--)+"张票");
				}
			}*/
			//同步方法
//			myrun();
			//同步静态方法
//			myStaticRun();
			
			
			//Lock同步代码块
			try {
				lock.lock();
				if (ticketNum>0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"正在出售：第"+(ticketNum--)+"张票");
				}
			} finally{
				lock.unlock();
			}
			
			
		}
	}
	//同步方法
	/*@SuppressWarnings("unused")
	private synchronized void myrun(){
		if (ticketNum>0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"正在出售：第"+(ticketNum--)+"张票");
		}
	}*/
	//同步静态方法
	/*@SuppressWarnings("unused")
	private static synchronized void myStaticRun(){
		if (ticketNum>0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"正在出售：第"+(ticketNum--)+"张票");
		}
	}*/
		
}

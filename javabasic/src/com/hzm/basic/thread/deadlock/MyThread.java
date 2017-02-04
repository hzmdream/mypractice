package com.hzm.basic.thread.deadlock;

public class MyThread implements Runnable{

	//创建两把锁
	private static final Object lockA = new Object();
	private static final Object lockB = new Object();
	
	//创建共享数据
	private Boolean flag;
	
	public MyThread() {
		
	}
	public MyThread(Boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
		if (flag) {
			synchronized(lockA){
				System.out.println("if lockA");
				synchronized(lockB){
					System.out.println("if lockB");
				}
			}
		}else {
			synchronized(lockB){
				System.out.println("else lockB");
				synchronized(lockA){
					System.out.println("else lockA");
				}
			}
		}
		
	}

}

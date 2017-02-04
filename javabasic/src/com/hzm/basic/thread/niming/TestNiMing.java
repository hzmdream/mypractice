package com.hzm.basic.thread.niming;

public class TestNiMing {
	
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <= 100; i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
		});
		Thread t2 = new Thread(){
			@Override
			public void run() {
				for (int i = 0; i <= 100; i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
		};
		t.start();
		t2.start();
	}
}

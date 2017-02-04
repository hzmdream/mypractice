package com.hzm.basic.thread.poolsum;

import java.util.concurrent.Callable;

public class MyThread implements Callable<Integer>{

	private int num;
	
	public MyThread(){}
	public MyThread(int num){
		this.num = num;
	}
	

	@Override
	public Integer call() throws Exception {
		int count = 0;
		for (int i = 0; i <= num; i++) {
			count+=i;
		}
		return count;
	}

}

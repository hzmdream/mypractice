package com.hzm.basic.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试线程池
 * @author usky
 *
 */
public class TestThreadPool {
	
	public static void main(String[] args) {
		
		//创建线程池对象
		ExecutorService tpe = Executors.newFixedThreadPool(2);
		
		tpe.submit(new MyThread());
		tpe.submit(new MyThread());
		
		tpe.shutdown();
	}
}

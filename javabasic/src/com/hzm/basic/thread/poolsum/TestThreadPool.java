package com.hzm.basic.thread.poolsum;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 测试线程池
 * @author usky
 *
 */
public class TestThreadPool {
	
	public static void main(String[] args) {
		
		//创建线程池对象
		ExecutorService tpe = Executors.newFixedThreadPool(2);
		
		Future<Integer> submit = tpe.submit(new MyThread(100));
		Future<Integer> submit2 = tpe.submit(new MyThread(1000));
		try {
			System.out.println(submit.get()+"---"+submit2.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		tpe.shutdown();
	}
}

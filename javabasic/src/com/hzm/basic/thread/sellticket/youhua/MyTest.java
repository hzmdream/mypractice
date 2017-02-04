package com.hzm.basic.thread.sellticket.youhua;

public class MyTest {

	public static void main(String[] args) {
		
		Ticket t = new Ticket();
		ConsumThread ct = new ConsumThread(t);
		ProductThread pt = new ProductThread(t);
		
		Thread th = new Thread(ct,"生产窗口1");
		Thread th2 = new Thread(ct,"生产窗口2");
		Thread th3 = new Thread(ct,"生产窗口3");
		Thread th4 = new Thread(ct,"生产窗口4");
		Thread th5 = new Thread(ct,"生产窗口5");
		
		Thread th6 = new Thread(pt,"消费窗口1");
		Thread th7 = new Thread(pt,"消费窗口2");
		Thread th8 = new Thread(pt,"消费窗口3");
		Thread th9 = new Thread(pt,"消费窗口4");
		Thread th10 = new Thread(pt,"消费窗口5");
		
		th.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		th7.start();
		th8.start();
		th9.start();
		th10.start();
	}
}

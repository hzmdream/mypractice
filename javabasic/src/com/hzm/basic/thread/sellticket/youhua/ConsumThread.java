package com.hzm.basic.thread.sellticket.youhua;

public class ConsumThread implements Runnable{


	private Ticket product ;
	public ConsumThread() {
		super();
	}
	public ConsumThread(Ticket product) {
		this.product = product;
	}
	
	
	@Override
	public void run() {
		//设置product值
		while (true) {
			try {
				Thread.sleep(1000);
				product.getTicketNum();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}

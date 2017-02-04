package com.hzm.basic.thread.sellticket.youhua;
/**
 * 生产者
 * @author usky
 *
 */
public class ProductThread implements Runnable{
	
	private Ticket product ;
	public ProductThread() {
		super();
	}
	public ProductThread(Ticket product) {
		this.product = product;
	}
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				product.setTicketNum();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}

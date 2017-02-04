package com.hzm.basic.thread.productconsum.youhua;

public class ConsumThread implements Runnable{


	private Product product ;
	public ConsumThread() {
		super();
	}
	public ConsumThread(Product product) {
		this.product = product;
	}
	
	
	@Override
	public void run() {
		//设置product值
		while (true) {
			product.getAttr();
		}
		
	}

}

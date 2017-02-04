package com.hzm.basic.thread.productconsum;

public class ConsumThread implements Runnable{


	private Product product ;
	private int x = 0;
	
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
			synchronized(product){
				if (product.getFlag()) {//true
					try {
						product.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (x%2==0) {
					product.setUserName("卫庄");
					product.setUserAge("21");
				}else {
					product.setUserName("盖聂");
					product.setUserAge("23");
				}
				x++;
				product.setFlag(true);
				product.notify();

			}
		}
		
	}

}

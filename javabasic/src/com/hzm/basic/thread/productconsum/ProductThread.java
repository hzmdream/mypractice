package com.hzm.basic.thread.productconsum;
/**
 * 生产者
 * @author usky
 *
 */
public class ProductThread implements Runnable{
	
	private Product product ;
	public ProductThread() {
		super();
	}
	public ProductThread(Product product) {
		this.product = product;
	}
	@Override
	public void run() {
		while (true) {
			synchronized(product){
				if (!product.getFlag()) {//false
					try {
						product.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("消费者---名称："+product.getUserName()+",年龄："+product.getUserAge());
				product.setFlag(false);
				product.notify();
			}
		}
	}

}

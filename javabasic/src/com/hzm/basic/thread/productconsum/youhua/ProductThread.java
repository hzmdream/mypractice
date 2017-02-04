package com.hzm.basic.thread.productconsum.youhua;
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
			product.setAttr();
		}
	}

}

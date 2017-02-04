package com.hzm.basic.thread.productconsum;

public class TestPC {

	public static void main(String[] args) {
		
		Product p = new Product();
		p.setFlag(false);
		ProductThread pt = new ProductThread(p);
		ConsumThread ct = new ConsumThread(p);
		
		Thread ctt = new Thread(ct);
		Thread ptt = new Thread(pt);
		
		ctt.start();
		ptt.start();
	}
}

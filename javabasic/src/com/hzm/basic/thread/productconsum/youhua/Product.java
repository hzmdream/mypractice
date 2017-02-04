package com.hzm.basic.thread.productconsum.youhua;


public class Product {

	private String userName;
	private String userAge;
	private boolean flag;//默认为false,数据为空
	private int x = 0;
	public Product() {
		
	}
	public Product(String userName,String userAge) {
		this.userName = userName;
		this.userAge = userAge;
	}

	public synchronized void setAttr(){
		if (flag) {//true,生产等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (x%2==0) {
			this.userName="卫庄";
			this.userAge="12";
		}else {
			this.userName="孟星魂";
			this.userAge="34";
		}
		x++;
		flag = true;
		this.notify();
	}
	public synchronized void getAttr(){
		if (!flag) {//false，消费等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.userName+"---"+this.userAge);
		flag = false;
		this.notify();
	}
}

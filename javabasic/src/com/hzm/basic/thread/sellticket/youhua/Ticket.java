package com.hzm.basic.thread.sellticket.youhua;
/**
 * 是否存在线程安全问题的判断依据：
 * 	是否是多线程操作
 * 	是否有共享数据
 * 	是否有多行代码操作共享数据
 * @author usky
 *
 */
public class Ticket {
	
	private int ticketNum;
	private boolean flag;
	
	public synchronized void setTicketNum(){
		if (flag) {//true,有票就等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"--正在生产第"+(++ticketNum)+"张票");;
		flag = true;
		this.notify();
	}
	
	public synchronized void getTicketNum(){
		if (!flag) {//false,没票就等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"--正在售卖第"+ticketNum+"张票");
		flag=false;
		this.notify();
	}
}

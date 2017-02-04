package com.hzm.basic.thread.dingshi;

import java.util.Timer;

public class MyTimer {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		timer.schedule(new MyTimerTask(), 3000L, 2000L);
		
	}
}

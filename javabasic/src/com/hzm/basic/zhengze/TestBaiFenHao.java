package com.hzm.basic.zhengze;

public class TestBaiFenHao {

	public static void main(String[] args) {
		String rule = "[0-9]+%";
		String str = "航班离站时间前4小时（含）以前办理退票，收取50%票价退票费；航班离站时间前4小时（不含）以后办理退票，收取100%票价退票费。";
		boolean matches = str.matches(rule);
		System.out.println(matches);
	}
}

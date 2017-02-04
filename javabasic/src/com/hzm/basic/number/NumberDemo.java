package com.hzm.basic.number;

import java.math.BigDecimal;

public class NumberDemo {

	
	public static void main(String[] args) {
		String numStr = "4146.123456";
		BigDecimal bgNum = new BigDecimal(numStr);
		System.out.println(bgNum.toString());
	}
}

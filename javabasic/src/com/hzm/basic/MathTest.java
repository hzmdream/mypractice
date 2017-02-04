package com.hzm.basic;

/**
 * @author 侯志明
 * @version 1.0.0
 */
public class MathTest {

	//私有化构造方法
	private MathTest() {
		super();
	}
	/**
	 * 创建1-100之间的随机数，并返回
	 * @return 随机数
	 */
	public static int getRandomNumber(){
		return  (int)(Math.random()*100)+1;
	}

	
}

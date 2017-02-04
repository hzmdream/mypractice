package com.hzm.basic.testenum;

public class TestEnum {

	public static void main(String[] args) {
		/*String exceptionName = "";
		try {
			DTPExcetptionUtil.getExceptionName("1005");
		} catch (IllegalArgumentException e) {
			//向数据库插入改异常
//			throw new RuntimeException("未定义异常，已插入数据库");
			System.out.println("未定义异常，已插入数据库");
		}*/
		System.out.println(DTPExcetptionUtil.getExceptionName("1005"));
	}
}

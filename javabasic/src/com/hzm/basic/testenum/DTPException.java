package com.hzm.basic.testenum;

public enum DTPException {

	FLIGHT1001("查询航班失败"),FLIGHT1002("接口访问异常"),FLIGHT1003("航班不存在"),FLIGHT1004("未识别的异常"),
	ORDER1001("查询订单失败"),ORDER1002("查询订单失败"),ORDER1003("查询订单失败"),ORDER1004("查询订单失败"),;
	
	//public static final DTPException FLIGHT1005 = new DTPException("查询航班失败");
	
	
	private String exceptionName;
	private DTPException(String exceptionName){
		this.exceptionName = exceptionName;
	}
	public String getExceptionName(){
		return exceptionName;
	}
}

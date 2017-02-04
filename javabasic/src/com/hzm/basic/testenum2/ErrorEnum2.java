package com.hzm.basic.testenum2;

public enum ErrorEnum2 {

	NO_ITINERARIES_FOUND("没有发现行程"),BOOKING_FAILED("创建订单失败");
	
	private String errorMessage;
	private ErrorEnum2(String errorMessage){
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage(){
		return errorMessage;
	}
}

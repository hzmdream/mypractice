package com.hzm.basic.testenum2;

public class MoNiEnum2 {
	
	public static final MoNiEnum2 NO_ITINERARIES_FOUND= new MoNiEnum2("没有发现行程");
	public static final MoNiEnum2 BOOKING_FAILED= new MoNiEnum2("创建订单失败");
	
	private String errorMessage;
	private MoNiEnum2(String errorMessage){
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage(){
		return errorMessage;
	}
	
}

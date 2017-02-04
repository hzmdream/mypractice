package com.hzm.basic.testenum2;

public enum ErrorEnum3 {

	NO_ITINERARIES_FOUND("没有发现行程") {
		@Override
		public void saveError() {
			System.out.println("插入数据库：错误码："+this.toString()+" ; 错误信息："+this.getErrorMessage());
		}
	},BOOKING_FAILED("创建订单失败") {
		@Override
		public void saveError() {
			// TODO Auto-generated method stub
			System.out.println("插入数据库：错误码："+this.toString()+" ; 错误信息："+this.getErrorMessage());
		}
	};
	
	private String errorMessage;
	private ErrorEnum3(String errorMessage){
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage(){
		return errorMessage;
	}
	
	public abstract void saveError();
}

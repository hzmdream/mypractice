package com.hzm.basic.testenum2;

public abstract class MoNiEnum3 {
	
	public static final MoNiEnum3 NO_ITINERARIES_FOUND= new MoNiEnum3("没有发现行程"){

		@Override
		public void iwant() {
			// TODO Auto-generated method stub
			System.out.println("插入数据库：错误码："+this.toString()+" ; 错误信息："+this.getErrorMessage());
		}
		
	};
	public static final MoNiEnum3 BOOKING_FAILED= new MoNiEnum3("创建订单失败"){

		@Override
		public void iwant() {
			// TODO Auto-generated method stub
			System.out.println("插入数据库：错误码："+this.toString()+" ; 错误信息："+this.getErrorMessage());
		}};
	
	private String errorMessage;
	private MoNiEnum3(String errorMessage){
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage(){
		return errorMessage;
	}
	
	public abstract void iwant(); 
	
}

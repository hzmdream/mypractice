package com.hzm.basic.myexception;


public class MyException extends RuntimeException{
	
	private static final long serialVersionUID = -592268126765219642L;

	public MyException(String exceptionMessage){
		super(exceptionMessage);
	}
}

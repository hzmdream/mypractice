package com.hzm.basic.testenum;

public class DTPExcetptionUtil {

	public static String getExceptionName(String exceptionNo){
		/*switch (exceptionNo) {
			case "1001":
				
				return DTPException.FLIGHT1001.getExceptionName();
			case "1002":
				
				return DTPException.FLIGHT1002.getExceptionName();
			case "1003":
		
				return DTPException.FLIGHT1003.getExceptionName();
	
			default:
				return DTPException.FLIGHT1004.getExceptionName();
		}*/
		String exceptionName ="";
		try {
			DTPException.valueOf(DTPException.class, "FLIGHT"+exceptionNo).getExceptionName();
		} catch (Exception e) {
			System.out.println("未定义的异常，已插入数据库---COOD:"+exceptionNo);
			exceptionName="系统未定义的异常";
		}
		return exceptionName;
	}
}

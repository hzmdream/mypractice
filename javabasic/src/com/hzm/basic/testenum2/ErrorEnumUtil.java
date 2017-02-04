package com.hzm.basic.testenum2;

public class ErrorEnumUtil {

	public static String getMessageByErrorCode(String errorCode){
		String errorMessage ="未定义错误码";
		try {
			errorMessage = Enum.valueOf(ErrorEnum3.class, errorCode).getErrorMessage();
			Enum.valueOf(ErrorEnum3.class, errorCode).saveError();
		} catch (IllegalArgumentException e) {
			System.out.println("发现新错误码,插入数据库：错误码："+errorCode);
			System.out.println("异常信息："+e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("未知错误");
			System.out.println("异常信息："+e.getMessage());
		}
		
		return errorMessage;
	}
}

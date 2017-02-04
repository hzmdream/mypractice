package com.hzm.basic.testenum2;

import java.util.Scanner;

public class TestMoNiEnum {

	public static void main(String[] args) {
//		System.out.println(MoNiEnum.NO_ITINERARIES_FOUND);
//		System.out.println(MoNiEnum.BOOKING_FAILED);
//		
//		System.out.println("----------------------------------");
//		
//		System.out.println(MoNiEnum2.NO_ITINERARIES_FOUND+"==="+MoNiEnum2.NO_ITINERARIES_FOUND.getErrorMessage());
//		System.out.println(MoNiEnum2.BOOKING_FAILED+"==="+MoNiEnum2.BOOKING_FAILED.getErrorMessage());
//		
//		System.out.println("-----------------------------------");
//		
//		System.out.println(MoNiEnum3.NO_ITINERARIES_FOUND+"==="+MoNiEnum3.NO_ITINERARIES_FOUND.getErrorMessage());
//		MoNiEnum3.NO_ITINERARIES_FOUND.iwant();
//		System.out.println(MoNiEnum3.BOOKING_FAILED+"==="+MoNiEnum3.BOOKING_FAILED.getErrorMessage());
//		MoNiEnum3.BOOKING_FAILED.iwant();
//		
//		System.out.println("------------------------------------");
//		
//		System.out.println(ErrorEnum.BOOKING_FAILED);
//		System.out.println(ErrorEnum.NO_ITINERARIES_FOUND);
//		System.out.println("-------------------------------------");
//		System.out.println(ErrorEnum2.NO_ITINERARIES_FOUND+"==="+ErrorEnum2.NO_ITINERARIES_FOUND.getErrorMessage());
//		System.out.println(ErrorEnum2.BOOKING_FAILED+"==="+ErrorEnum2.BOOKING_FAILED.getErrorMessage());
//		System.out.println("-------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入错误码：");
		String nextLine = sc.nextLine();
		String messageByErrorCode = ErrorEnumUtil.getMessageByErrorCode(nextLine);
		System.out.println(messageByErrorCode);
	}
}

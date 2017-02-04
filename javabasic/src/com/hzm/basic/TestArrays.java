package com.hzm.basic;

import java.util.Arrays;
import java.util.List;

/**
 * @author houzm
 * 数组与集合的相互转换
 *
 */
public class TestArrays extends Object{
	

	public static void main(String[] args) {
		
		//创建字符串数组
		String [] strArr = new String[]{"hou","zhi","ming"};
		
		//数组转换为集合
		List<String> asList = Arrays.asList(strArr);
		List<String> asList2 = Arrays.asList("hou","zhi","ming");
		System.out.println(asList);
		System.out.println(asList2);

		System.out.println("--------------------------------------");
		//将集合转换为数组
		String[] array = (String[]) asList.toArray();
		String[] array2 = (String[]) asList2.toArray();
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
	}
}

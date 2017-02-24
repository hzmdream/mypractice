package com.hzm.basic.myexception;

import java.util.Scanner;

public class TestMyExc {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入您的分数：");
			String nextLine = sc.nextLine();
			Integer valueOf = Integer.valueOf(nextLine);
			if (valueOf<0||valueOf>100) {
				throw new MyException("您的分数不合法");
			}else {
				System.out.println("插入数据库：分数："+valueOf);
			}
		}
		
	}
}

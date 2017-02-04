package com.hzm.basic.thread.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class PracticeFirst {
	private static String caves = "山洞";
	public static void main(String[] args) {
		
		//读取文件中的姓名，放入list集合
		List<String> list = new ArrayList<String>();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("username.txt"));
			String line;
			while((line=br.readLine())!=null){
				list.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//人数
		int num = 10;
		
		//创建随机数(不重复)
		Random rd = new Random();
		/*Map<Integer, Set<String>> map = new HashMap<Integer,  Set<String>>();
		for (int i = 0; i < num*10; i++) {
			int nextInt = rd.nextInt(10)+1;
			if (map.size()>=10) {
				continue;
			}
			if (!map.containsKey(nextInt)) {
				System.out.println(nextInt);
				map.put(nextInt, list.get(nextInt-1));
			}
			
		}
		//遍历map
		Set<Integer> keySet = map.keySet();
		for (Integer integer : keySet) {
			System.out.println("序号："+integer+";名称："+map.get(integer));
		}*/
		for (int i = 0; i < list.size(); i++) {
			//打印list集合
//			System.out.println(list.get(i));
			//每位成员都创建线程
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					//通过山洞
					throwCaves();
				}
			},list.get(i)).start();
			
		}
		/**/
	}
	
	public static synchronized void throwCaves(){
		//耗时5秒
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"=====通过"+caves);
	}
}

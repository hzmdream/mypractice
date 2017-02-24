package com.hzm.basic.urlencode;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MyUrlEncode {

	public static void main(String[] args) {
		String str = "username=侯志明&password=123456&sex=man&age=25";
		try {
			String encode = URLEncoder.encode(str, "utf-8");
			System.out.println(encode);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
}

package com.heima.test;

import java.math.BigInteger;

public class Test6 {

	public static void main(String[] args) {
		//demo1();
		BigInteger bi1 = new BigInteger("1");
		for (int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(i + "");
			bi1 = bi1.multiply(bi2);
		}
		String str = bi1.toString();
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if('0' != str.charAt(i)) {
				break;
			}else {
				count++;
			}
		}
		System.out.println(count);
	}

	private static void demo1() {
		BigInteger bi1 = new BigInteger("1");
		for (int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(i + "");
			bi1 = bi1.multiply(bi2);
		}
		String str = bi1.toString();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ('0' == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

}

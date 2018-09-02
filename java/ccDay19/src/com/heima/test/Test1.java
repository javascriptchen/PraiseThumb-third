package com.heima.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字：");
		while(true) {
			String line = sc.nextLine();
			try {
				int num = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(num));
			} catch (Exception e) {
				try {
					new BigInteger(line);
					System.out.println("录入错误,您录入的是一个过大整数,请重新输入一个整数:");
				} catch (Exception e2) {
					try {
						new BigDecimal(line);
						System.out.println("录入错误,您录入的是一个小数,请重新输入一个整数:");
					} catch (Exception e3) {
						System.out.println("录入错误,您录入的是非法字符,请重新输入一个整数:");

					}
				}
			}
		}
		
		
	}

}

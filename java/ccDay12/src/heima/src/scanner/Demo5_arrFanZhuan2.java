package heima.src.scanner;

import java.util.Scanner;

public class Demo5_arrFanZhuan2 {

	public static void main(String[] args) {
		System.out.println("请输入要反转的文字");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		String s = "";
		char c = 0;
		for (int i = 0; i < arr.length/2; i++) {
			c = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = c;
		}
		
		System.out.println(String.valueOf(arr));
		
	}

}

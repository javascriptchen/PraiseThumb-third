package heima.src.scanner;

import java.util.Scanner;

public class Demo4_fanzhuan {

	public static void main(String[] args) {
		System.out.println("请输入要反转的文字");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		String s = "";
		for (int i = arr.length-1; i >= 0; i--) {
			s = s + arr[i];
		}
		System.out.println(s);
		
	}

}

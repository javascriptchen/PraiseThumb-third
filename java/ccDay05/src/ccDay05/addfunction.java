package ccDay05;

import java.util.Scanner;

public class addfunction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int a = scanner.nextInt();
		System.out.println("请输入第二个数字");
		int b = scanner.nextInt();
		
		int max = getMax(a,b);
		System.out.println("最大值为："+max);
	}
	
	public static int getMax(int a, int b) {
		int max = a > b ? a : b;
		return max;
	}

}

package ccDay03;

import java.util.Scanner;

public class keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int x = scanner.nextInt();
		System.out.println("x:" + x);
		System.out.println("请再输入一个数字：");
		int y = scanner.nextInt();
		System.out.println("y:" + y);
		int max = x > y ? x : y;
		System.out.println("输入的最大值为：" + max);
	}

}

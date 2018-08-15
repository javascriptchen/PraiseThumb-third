package heima.src.scanner;

import java.util.Scanner;

public class Demo2_scanner {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {

			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String userName = sc.nextLine();
			System.out.println("请输入密码：");
			String passWord = sc.nextLine();

			if ("admin".equals(userName) && "admin".equals(passWord)) {
				System.out.println("欢迎" + userName + "登录");
				break;
			} else {
				if (i == 2) {
					System.out.println("您的错误次数已经到了，请明天再试");
				} else {
					System.out.println("用户名或密码错误");
					System.out.println("这是您第" + (i + 1) + "次登录，您还有" + (2 - i) + "次机会");

				}
			}
		}

	}
}

package ccDay04;

import java.util.Scanner;

public class season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份：");
		int num = scanner.nextInt();
		switch(num) {
		case 1 :
			System.out.println("春季");
			break;
		case 2 :
			System.out.println("夏季");
			break;
		case 3 :
			System.out.println("秋季");
			break;
		case 4 :
			System.out.println("冬季");
			break;
		default:
			System.out.println("没有您输入的季节");
		}
	}

}

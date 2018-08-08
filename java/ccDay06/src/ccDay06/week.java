package ccDay06;

import java.util.Scanner;

public class week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入1-7的数字：");
		char[] weeks = {'一','二','三','四','五','六','日'};
		Scanner scanner = new Scanner(System.in);
		int week = scanner.nextInt();
		if(week>=1&&week<=7) {
			System.out.println("星期" + weeks[week-1]);
			
		}
	}
}

package birthday;

import java.util.Calendar;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份，判断该年份是平年还是闰年");
//		int year = sc.nextInt();
		String line = sc.nextLine();
		int year = Integer.parseInt(line);
		boolean b = getYear(year);
		System.out.println(b);
	}

	private static boolean getYear(int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		return c.get(Calendar.DAY_OF_MONTH) == 29;
	}

}

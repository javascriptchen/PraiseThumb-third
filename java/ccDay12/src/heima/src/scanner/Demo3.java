package heima.src.scanner;

public class Demo3 {

	public static void main(String[] args) {
		String s = "ABCDEabcd123456!@#$%^";
		int big = 0;
		int small = 0;
		int digit = 0;
		int other = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ('A' <= c && 'Z' >= c) {
				big++;
			} else if ('a' <= c && 'z' >= c) {
				small++;
			} else if ('0' <= c && '9' >= c) {
				digit++;
			} else {
				other++;
			}
		}
		System.out.println("大写字母有：" + big + "个，小写字母有：" + small + "个，数字有：" + digit + "个，其他有：" + other + "个");
	}

}

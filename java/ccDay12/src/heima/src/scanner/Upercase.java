package heima.src.scanner;

public class Upercase {
	public static void main(String[] args) {
		String i = "sdkjJKLkjsl";
		String i2 = i.substring(0,1).toUpperCase().concat(i.substring(1).toLowerCase());
		System.out.println(i2);
	}
}

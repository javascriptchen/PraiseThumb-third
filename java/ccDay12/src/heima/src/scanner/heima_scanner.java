package heima.src.scanner;

import java.util.Scanner;

public class heima_scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int i = sc.nextInt();
			System.out.println(i);
		}
	}
}

package integer_parseInt;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class time {
	public static void main(String[] args) {
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 1000; i++) {
//			System.out.println("*");
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
//		
//		System.out.println(());
		time.m2();
		BigDecimal bd1 = new BigDecimal("2.0");
		BigDecimal bd2 = new BigDecimal("1.1");
		System.out.println(bd1.subtract(bd2));
	}

	public static void m2() {
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println(df.format(5.0 - 1.1));
	}
}

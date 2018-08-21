package birthday;

import java.util.Calendar;

import org.w3c.dom.CDATASection;

public class Date1 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
//		System.out.println(c.get(Calendar.YEAR));
//		System.out.println(c.get(Calendar.MONTH));
//		System.out.println(c.get(Calendar.DAY_OF_MONTH));
//		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.YEAR) + "年" + getNum(c.get(Calendar.MONTH)) + "月"
				+ getNum(c.get(Calendar.DAY_OF_MONTH)) + "日" + Date1.getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}

	public static String getWeek(int week) {
		String[] arr = { "", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		return arr[week];
	}

	public static String getNum(int num) {
		/*
		 * if (num < 10) { return "0" + num; }else { return ""+num; }
		 */
		return num < 10 ? "0" + num : "" + num;
	}
}

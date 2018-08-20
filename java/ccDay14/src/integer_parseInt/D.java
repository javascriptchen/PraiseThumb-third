package integer_parseInt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D {
	public static void main(String[] args) {
		/*
		 * Pattern p = Pattern.compile("a*b"); Matcher m = p.matcher("aaaaab"); boolean
		 * b = m.matches(); System.out.println(b);
		 */
		String s = "我的手机是18511866260,我曾用过18987654321,还用过18812345678";
		String regex = "1[3578]\\d{9}";
		Pattern p = Pattern.compile(regex); // 获取到正则表达式
		Matcher m = p.matcher(s); // 获取匹配器
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}

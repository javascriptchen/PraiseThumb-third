package heima.src.scanner;

public class Demo6_jiequ {

	public static void main(String[] args) {
		String max = "heimaheimaheimabaimabaimaheima";
		String min = "heima";
		int count = 0;
		int index = 0;
		
		while((index = max.indexOf(min)) != -1) {
			count++;
			max = max.substring(index + min.length());
		}
		System.out.println(count);
	}

}

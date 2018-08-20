package integer_parseInt;

import java.util.Arrays;

public class integer {
	public static void main(String[] args) {
		String s = "2,6,2,5,1,7";
		String[] sArr = s.split(",");
		int[] arr = new int[sArr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sArr[i]);
		}
		
		Arrays.sort(arr);
		
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				str.append(arr[i]);
			}else {
				str.append(arr[i]+" ");
			}
		}
		System.out.println(str);
	}
}

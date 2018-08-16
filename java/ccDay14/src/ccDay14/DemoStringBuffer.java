package ccDay14;

public class DemoStringBuffer {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(array2String(arr));
	}

	public static String array2String(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i] + "]");
			} else {
				sb.append(arr[i] + ", ");
			}
		}
		return sb.toString();
	}
}

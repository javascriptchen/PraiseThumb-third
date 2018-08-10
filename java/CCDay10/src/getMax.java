
public class getMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 22, 3, 4 };
//		ArrayTool a = new ArrayTool();
		int max = ArrayTool.getMax(arr1);
		System.out.println("max是：" + max);

		ArrayTool.print(arr1);

		ArrayTool.reverse(arr1);

		ArrayTool.print(arr1);
	}

}

/**
 * 
 * @author @
 *
 */
class ArrayTool {
	/**
	 * // *
	 * 
	 * @param arr
	 * @return
	 */
	// 获取最大值
	public static int getMax(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	// 数组遍历
	public static void print(int arr[]) {
		System.out.println("=====打印开始======");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=====打印结束======");
	}

	// 数组反转
	public static void reverse(int arr[]) {
		int num = arr.length / 2;
		int num1 = arr.length;
		int tep = 0;
		for (int i = 0; i < num; i++) {
			tep = arr[i];
			arr[i] = arr[num1 - i - 1];
			arr[num1 - i - 1] = tep;
		}
	}
}
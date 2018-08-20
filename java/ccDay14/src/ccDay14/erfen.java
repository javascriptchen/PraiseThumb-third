package ccDay14;

public class erfen {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 7 };
		System.out.println(erFen(arr, 3));
	}

	public static int erFen(int[] arr, int value) {
		int max = arr.length - 1;
		int min = 0;
		int mid = (max + min) / 2;

		while (arr[mid] != value) {
			if (arr[mid] < value) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}

			mid = (min + max) / 2;
			if (min > max) {
				return -1;
			}
		}
		return mid;
	}
}

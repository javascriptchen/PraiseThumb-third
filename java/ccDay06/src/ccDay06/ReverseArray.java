package ccDay06;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		int[] arr1 = new int[3];
		int length = arr.length;
		for(int i = 0; i < length; i++) {
			arr1[i] = arr[length - 1 - i];
		}
		for(int i = 0; i < length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println(arr1);
	}

}

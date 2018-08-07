package ccDay06;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			max = max > arr[i] ? max : arr[i];
		}
		System.out.println(max);
	}

}

package ccDay05;

public class mutiplyform {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 9;
		int column = 9;
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
				
			}
			System.out.println("");
		}
	}
}

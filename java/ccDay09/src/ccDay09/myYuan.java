package ccDay09;

public class myYuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yuan yuan = new Yuan(5);
		yuan.calc();
		yuan.setBanJing(1);
		yuan.calc();
	}

}

class Yuan{
	private double banjing;
	
	public Yuan(double banjing) {
		this.banjing = banjing;
	}
	
	public Yuan() {
		
	}
	
	public void setBanJing(double banjing) {
		this.banjing = banjing;
	}
	
	public double getArea() {
		return banjing * banjing * 3.14;
	}
	
	public double getLength() {
		return banjing * 2 * 3.14;
	}
	
	public void calc() {
		System.out.println("圆的周长是" + this.getLength() + "面积是" + this.getArea());
	}
}
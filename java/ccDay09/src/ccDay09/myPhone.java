package ccDay09;

public class myPhone {

	public static void main(String[] args) {
		Phone p1 = new Phone("苹果",8999);
//		p1.setBrand("苹果");
		p1.setPrice(5999.09);
		p1.say();
	}

}

class Phone{
	private String brand;
	private double price;
	
	public Phone(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public Phone() {}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void say() {
		System.out.println(brand + "牌手机，仅售" + price + "元");
	}
}

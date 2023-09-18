
public class laptop implements Comparable<laptop>
{
	private String Brand;
	private int Ram;
	private int Price;
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getRam() {
		return Ram;
	}
	public void setRam(int ram) {
		Ram = ram;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public laptop(String brand, int ram, int price) {
		super();
		Brand = brand;
		Ram = ram;
		Price = price;
	}
	
	public String toString() {
		return "laptop [Brand=" + Brand + ", Ram=" + Ram + ", Price=" + Price + "]";
	}
	
	
	@Override
	public int compareTo(laptop l2)
	{
		if(this.getRam() > l2.getRam())
		
			return 1;
		
		else if(this.getRam() < l2.getRam())
		
			return -1;
		
		else
			return 0;
	}
	
	
	

}

package shopping;

public class Product {
	protected String name;
	protected int price;
	public String getName() {
		return name;
	}
	public Product(int price,String name){
		this.price = price;
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}
	
}

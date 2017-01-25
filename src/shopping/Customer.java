package shopping;

public class Customer {
	private int money;
	private Product[] cart;  //다형성 구조적으로 짠다음에 한번에 담는것.
	public Customer() {
		money = 1000;
		cart = new Product[4];
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Product[] getCart() {
		return cart;
	}
	public void setCart(Product[] cart) {
		this.cart = cart;
	}
	
	
	
	
}

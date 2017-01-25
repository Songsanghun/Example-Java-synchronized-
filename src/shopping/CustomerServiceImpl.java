package shopping;

public class CustomerServiceImpl implements CustomerService{
	Customer c;
	int i;
	public CustomerServiceImpl() {
		c = new Customer();
		i = 0;
	}
	@Override
	public String buy(Product p) {
		// 물건을 구매시 현재 금액과 차이를 보고
		// 구매가능한지를 따진다.
		// 만약 가진 돈이 작으면 잔액이 부족합니다라고 한다.		
		String result = "잔액부족";
		int money = c.getMoney();
		if( money >= p.getPrice()){
			money = money -  p.getPrice();
			c.setMoney(money);
			add(p);
			result = "카트에 추가됨";
		}
		return result;
	}
	@Override
	public void add(Product p) {
		// 카트에 추가시키는 로직
		c.getCart()[i]=p;
		i++;
	}
	@Override
	public String getBill() {
		// 쇼핑을 마치고 영수증을 출력한다. 산것들의 대한 toString 만 나오면 된다.
		// TV .... 300
		// 지금 상황에선 3개만 구입한 내용이 나온다.
		String temp = "";
		for(int j=0;j<i;j++){
			temp += c.getCart()[j].toString()+"\n";
		}
		temp += "잔액은"+c.getMoney()+"입니다.";
		return temp;
	}
	
}

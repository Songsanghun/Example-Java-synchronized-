package shopping;

public class CustomerServiceImpl implements CustomerService{
	//필드에 속성이나 로컬 변수를 선언해 줘라. 기능과 속성을 분리 원칙.
	Customer c; //이 문장이 있기때문에 속성을 가질수있다.(유기적관계)
	Product[] cart;
	int i; // 필드는 초기화 되지 않는다 그러므로 i=0;은 메소드로 빼줘라
	// 필드에서는 연산 자체를 하지 않는다.
	// 필드에 선언한 것들은 DB에 저장할 애들이라서 연산을 하고 DB에 저장하지 않는다.
	// 연산하고 DB에 넣게되면 DB가 오염된다.
	// = 는 연산자 필드에 들어가게되면 DB가 오염 (DB가 신뢰를 잃는다.)
	public CustomerServiceImpl() {
		c = new Customer();
		cart = new Product[4]; // 4개 담을수 있는 카트를 여기서 준거
		i = 0;
	}
	
	@Override
	public String buy(Product p) { //Product p 자체가 
		// 물건을 구매시 현재 금액과 차이를 보고
		// 구매가능한지를 따진다.
		// 만약 가진 돈이 작으면 잔액이 부족합니다라고 한다.		
		String result = "잔액부족";
		int money = c.getMoney();
		if( money >= p.getPrice()){
			/*money = money -  p.getPrice();
			c.setMoney(money);
			*/
			c.setMoney(money = p.getPrice());
			add(p);
			result = "카트에 추가됨";
		}
		return result;
	}
	@Override
	public void add(Product p) {
		// 카트에 추가시키는 로직
		// cart[0] = p ; 이 문장은 배열을 배웟다면 바로 나왔어야 했다.
		// Product[] cart = c.getCart();
		cart[i]=p;
		i++;
	}
/**
 * 쇼핑을 마치고 영수증을 출력한다. 산것들의 대한 toString 만 나오면 된다.
 *	TV .... 300
 *	 지금 상황에선 3개만 구입한 내용이 나온다.
 */
	@Override
	public String getBill() {
		String temp = "";
		for(int j=0;j<i;j++){ // int i =0 이라고 해도 메소드안에 지역변수가 먼저 인식하기 때문에. 써도 되긴한다.
			temp += cart[j].toString()+"\n";
		}
		temp += "잔액은"+c.getMoney()+"입니다.";
		return temp;
	}
	
}

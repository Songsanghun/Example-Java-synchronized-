package shopping;

public interface CustomerService {
	public String buy(Product p);  //커스터머가 산다 뭐를(프로덕트)
	public void add(Product p);
	public String getBill();
}

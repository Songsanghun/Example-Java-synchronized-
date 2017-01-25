package shopping;

public class SmartPhone extends Product{
	public SmartPhone(){
		super(300,"스마트폰");
	}
	private String giga;
	
	@Override
	public String getName() {
		return "스마트폰";
	}

	public String getGiga() {
		return giga;
	}

	public void setGiga(String giga) {
		this.giga = giga;
	}
	@Override
	public String toString() {
		return "Cleaner [name=" + name + ", price=" + price + "]";
	}
}

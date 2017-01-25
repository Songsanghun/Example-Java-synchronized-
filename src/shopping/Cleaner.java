package shopping;

public class Cleaner extends Product{
	public Cleaner(){
		super(300,"청소기");
	}
	private String power;

	@Override
	public String getName() {
		return "청소기";
	}
	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Cleaner [name=" + name + ", price=" + super.getPrice() + "]";
	}
	
}

package shopping;

public class TV extends Product{
	private String size;
	public TV(){
		super(300,"텔레비전"); //부모의 값에 넣어줄수있다.
	}
	@Override
	public String getName() {
		return "텔레비전";
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "TV [name=" + name + ", price=" + super.getPrice()+ " ]";
	}
	
}

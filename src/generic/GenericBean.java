package generic;

public class GenericBean<T> {  //Bean 객체 (속성만 있고, getter , setter)
	private T val;

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}
	public GenericBean(T val){  //반드시 필요하다.
		this.val = val;
	}
	
}

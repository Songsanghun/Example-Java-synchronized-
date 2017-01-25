package phone;

public class Iphone extends Nokia{
	public final static String BRAND = "아이폰";
	protected String data;
	public void setData(String data){
		this.data = data;
	}
	public String getDate(){
		return data;
	}
	@Override
	public String toString() {
		return String.format("%s 때문에 %s한 상태에서 %s에서 '%s'을 검색했다.."
				,BRAND
				,move
				,receiver
				,this.data);
			}
}

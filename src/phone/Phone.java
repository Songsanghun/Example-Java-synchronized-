package phone;

public class Phone {     // extends Object 항상 있는데 생략되어있다.
	public final static String KIND = "삼성전화기";
	protected String receiver, call; //같은 패키지에 있는 객체와 상속 관계의 객체들만 허용 호율적으로 움직일수있다. 접근속도 때문에 프로텍티드 씀

	public void setReceiver(String receiver){
		this.receiver = receiver;
	}
	public String getReceiver(){
		return receiver;
	}
	public void setCall(String call){
		this.call = call;
	}
	public String getCall(){
		return call;
	}
	@Override
		public String toString() {
			return KIND+"를 사용해서 "+receiver+"에게"+call+"이라고 말했다.";
			// TODO Auto-generated method stub
			//return super.toString(); //super. --->>  우리 조상꺼의 뜻
		}
}

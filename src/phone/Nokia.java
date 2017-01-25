package phone;

public class Nokia extends Phone{
		public final static String BRAND = "NOKIA";
		protected String move;
		protected boolean portable; //이동성
		
		protected void setMove(String move){
			this.move = move;
		}
		protected String getMove(){
			return move;
		}
		protected void setPortable(boolean portable){
			if(portable){
				setMove("이동 가능");
			}else{
				setMove("이동 불가능");
			}
			this.portable = portable;
		}
		public boolean isPortable(){  //boolean 타입은 get이 아니라 is가 온다. (참과 거짓을 구별하는 것 이기 때문)
			return portable;
		}
	@Override
	public String toString() {
		return String.format("%s 때문에 %s한 상태에서 %s에게 '%s'라고 말했다."
				,BRAND
				,move
				,receiver
				,call);
			}		
}

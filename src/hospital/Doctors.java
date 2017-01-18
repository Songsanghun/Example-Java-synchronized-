package hospital;

public class Doctors {
	String docName,docGen,docPhone,docEmail,docPosition,majorTreat;
	int docId,docAge;

	String ssn;
	char ch,age1,age2;
	
	public void setDocName(String docName){
		this.docName = docName ;
	}
	
	
	
	
	
	
	
	
	
	
	
	public String getGender(String docGen){
			String result = "";
			char ch = docGen.charAt(7);
		
		if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			result = "다시 입력하세요.";
			}
		if (ch == '1' || ch == '3') {
			result="남자";
		} else if (ch == '2' || ch == '4') {
			result="여자";
		} else if(ch == '5' || ch == '6'){
			result="외국인";
		} else {
			result="올바른숫자가 아닙니다.";
		}
		return result;
	//docAge = 2017-(1986)string = 32 안된다.
	}
}
package hospital;

public class Nurses {
	String nurName,nurGen,nurPhone,nurEmail,nurPosition,majorJob;
	int nurId,nurAge;

	String ssn, name, gender;
	char ch;
	public String getGender(String nurGen){
	char ch = nurGen.charAt(7);
	String result = "";
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
}
}

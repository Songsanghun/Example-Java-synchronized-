package test;

public class Ssn {
	String ssn, name, gender, result;
	char ch;
	
	public void setSsn(String ssn){
		this.ssn = ssn;
	}
	public String getSsn(){
		return ssn;
	}
	public void setName(String name){
		this.name = name; 
	}
	public String getName(){
		return name;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
	public void setCh(char ch){
		this.ch = ch;
	}
	public char getCh(){
		return ch ;
	}
	
	public void calcGender(){
	char ch = ssn.charAt(7);
	if (ch == '1' || ch == '3') {
		result="남자";
	} else if (ch == '2' || ch == '4') {
		result="여자";
	} else if(ch == '5' || ch == '6'){
		result="외국인";
	} else {
		result="올바른숫자가 아닙니다.";
	}
	}	
	public String getResult(){
		return result;
	}
}
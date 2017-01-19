
package test;

public class BMI {
	private String uid;
	private double kg,cm;
	
/*	public void setName(String outName){
		name = outName ; 
	}*/
	public void setUid(String uid){
		this.uid = uid ; //this.name 의 name 은 String name 의 name 이다. this 는 가르키는것.
	}
	public String getUid(){
		return uid;   //this.name = name; 밤색은 Local Variable 파랑색은 instance Variable
	}
	public void setKg(double kg){
		this.kg = kg;
	}
	public double getKg(){
		return kg;
	} 
	public void setCm(double cm){
		this.cm = cm;
	}
	public double getCm(){
		return cm;
	} 
	// setter 를 생략하면, readOnly 파일 외부에서 수정불가 (그래서 보안이 훌륭)
	public String calcBMI(double cm,double kg){
		double bmi = 0;
		String grade = "";
		bmi = this.kg / (this.cm * this.cm)/10;
		if (bmi > 30.0) {
			grade = "고도비만";
		} else if (bmi > 25.0) {
			grade = "비만";
		} else if (bmi > 23.0) {
			grade = "과체중";
		} else if (bmi > 18.5) {
			grade = "정상";
		} else {
			grade = "저체중";
		}
		return grade;
		}
}
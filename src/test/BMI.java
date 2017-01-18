
package test;

public class BMI {
	private String name,grade;
	private int age;
	private double kg,cm,bmi;
	
/*	public void setName(String outName){
		name = outName ;
	}*/
	public void setName(String name){
		this.name = name ; //this.name 의 name 은 String name 의 name 이다. this 는 가르키는것.
	}
	public String getName(){
		return name;   //this.name = name; 밤색은 Local Variable 파랑색은 instance Variable
	}
	public void setAge(int age){
		this.age = age ;
	}
	public int getAge(){
		return age;
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
	public void setbmi(double bmi){
		this.bmi = bmi;
	}
	public double getbmi(){
		return bmi;
	} 
	// setter 를 생략하면, readOnly 파일 외부에서 수정불가 (그래서 보안이 훌륭)
	public void calcBMI(){
		bmi = kg / (cm * cm);
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
		}
	public String getResult(){  // local variable 반드시 initialize 를 하지 않는다.
		return grade;
	}
}
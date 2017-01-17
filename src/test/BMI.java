
package test;

public class BMI {
	String name,grade;
	int age;
	double kg,cm,bmi;
	public String getResult(double cm,double kg){  // instance variable 반드시 initialize 를 하지 않는다.
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
		return String.format("%s의 BMI 결과는 %s\n",name,grade) ;
	}
}
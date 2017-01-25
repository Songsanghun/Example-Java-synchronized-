
package hospital;

public class BMI extends Treatment{
	
	private double cm = 0, kg = 0;
	public void setCm(double cm){
		this.cm = cm ;
	}
	public double getCm(){
		return cm ;
	}
	public void setKg(double kg){
		this.kg = kg ; 
	}
	public double getKg(){
		return kg;
	}
	
	@Override
	public String treat() {
		double bmi = 0;
		String grade = "";
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
		return grade;
		}
}

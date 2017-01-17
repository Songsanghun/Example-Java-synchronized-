package test;

import java.util.Scanner;

public class Controller {
	
	public static void main(String[] args) {  // local variable 반드시 initialize
		Scanner s = new Scanner(System.in);
		System.out.println("어떤작업을 원하시나요? 1.BMI측정 2.성별입력 0.종료");
		int selector = s.nextInt();
		switch(selector){
		case 0: return;
		case 1:
			/*  BMI kim = new BMI();  //김유신
			BMI hong = new BMI(); //홍길동
			BMI song = new BMI(); //송상훈
	*/		
			BMI[] patients = new BMI[3];
			/*String[] arr = new String[3]; // 배열 선언
			arr[0] = "abc";
			arr[1] = "def";
			arr[2] = "ghi";*/
			for(int i=0;i<patients.length;i++){
				System.out.println("이름,나이,키,몸무게?");
				patients[i] = new BMI(); //initialize (초기화)
				patients[i].name = s.next();
				patients[i].age = s.nextInt();
				patients[i].cm = s.nextDouble();
				patients[i].kg = s.nextDouble();
				System.out.printf(patients[i].getResult(patients[i].cm,patients[i].kg));
				}break;
		case 2:
			Ssn member = new Ssn();
			System.out.println("이름 : ");
			member.name = s.next();
			System.out.println("주민번호 : ");
			member.ssn = s.next();
			//String gender = member.getGender(member.ssn);
			System.out.println(member.name + "(" + member.getGender(member.ssn)+")");
			//한석규(남)
			}
		}
}
 
		



package test;

import java.util.Scanner;

public class Controller {
	
	public static void main(String[] args) {  // local variable 반드시 initialize
		Scanner s = new Scanner(System.in);
		String temp = "";  // local variable
		System.out.println("어떤작업을 원하시나요? 1.BMI측정 2.성별입력 3.로또 4. 성적표 0.종료");
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
				patients[i].setName(s.next());
/*				String name = s.next();
				patients[i].setName(name);*/
				patients[i].setAge(s.nextInt());
				patients[i].setCm(s.nextDouble());
				patients[i].setKg(s.nextDouble());
				patients[i].calcBMI();
				System.out.printf("%s의 BMI 결과는 %s\n",
						patients[i].getName(),
						patients[i].getResult());
				}break;
				/*System.out.println("이름,나이,키,몸무게?");
				patients[i] = new BMI(); //initialize (초기화)
				patients[i].name = s.next(); //여기서 name 은 DB에 직접 받은것.
				patients[i].age = s.nextInt(); //여기서 name 은 DB에 직접 받은것.
				patients[i].cm = s.nextDouble(); //여기서 name 은 DB에 직접 받은것.
				patients[i].kg = s.nextDouble(); //여기서 name 은 DB에 직접 받은것.
				System.out.printf(patients[i].getResult(patients[i].cm,patients[i].kg));
				}break;*/
		case 2:
			Ssn member = new Ssn();
			System.out.println("이름 : ");
			member.setName(s.next());
			while(true){  // validation 유효성 체크
				System.out.println("주민번호 : ");
				temp = s.next();
				char ch = temp.charAt(7);
				if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
					System.out.println("다시 입력하세요."); 
				} else {
					member.setSsn(temp);
					break;
				}
			}
			member.calcGender();
			//String gender = member.getGender(member.ssn);
			System.out.printf("%s (%s)",member.getName(),member.getResult());
			break;
			//한석규(남)
		case 3:	
			//lotto
			break;
		case 4:
			ReportCard rep = new ReportCard();
			System.out.println("name : ");
	        rep.setName(s.next());
	        System.out.println("If the number of subject is 6, Auto quit!!");
	        int score = 0, total =0;
	        for(int i = 0;i<6;i++){
				System.out.println("score : ");
				score = s.nextInt();
				total += score;
    		}
	        rep.setTotal(total);
	        rep.setAverage(total/6);
	        rep.calcGrade();
	            System.out.printf("%s %s","name : ",rep.getName());
	            System.out.println("Total : "+rep.getTotal());
	            System.out.println("Average : "+rep.getAverage());
	            System.out.println("Grade :"+rep.getGrade());
			break;
			}
	}
}
 
		



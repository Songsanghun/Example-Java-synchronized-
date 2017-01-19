package test;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) { // local variable 반드시 initialize
		Scanner s = new Scanner(System.in);
		int i=0; // for 문을 위해서 : 계속 와일문 안에서 i를 생성하면 안되기 때문에.
		String ssn , bmiResult = ""; // local variable
		String gender = "";
		Member member=null;    // local variable 로컬 변수가 되는데 이것은 초기화 된다.
		while (true) {
			System.out.println("어떤작업을 원하시나요? 1.회원가입 2.BMI측정 3.로또 4. 성적표 0.종료");
			int selector = s.nextInt();
			switch (selector) {
			case 0:
				return;
			case 1:
				member = new Member();
				System.out.println("이름 : ");
				member.setName(s.next());
				while (true) { // validation 유효성 체크
					System.out.println("주민번호 : ");
					ssn = s.next();
					//input SSN
					char ch = ssn.charAt(7);
					if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
						System.out.println("다시 입력하세요.");
					} else {
						break;
					}
				}
				//[1]input ID
				System.out.println("아이디 : ");
				member.setUid(s.next());
				member.setSsn(ssn);
				// [2] calcGender 를 standAlone method
				gender = member.calcGender(ssn);
				
				// String gender = member.getGender(member.ssn);
				System.out.printf("%s (%s)", member.getName(), gender);
				break;
			// 한석규(남)
			case 2:
				BMI bmi = new BMI();
				String Uid = "";
				while(true){
					System.out.println("아이디를 입력하세요.");
					Uid = s.next();
					if(member.getUid().equals(Uid)){
						break;
					}else{System.out.println("다시 입력하세요.");}
				}
				bmi.setUid(Uid);
				//member.getUid().equals(tempUid); 아이디가 같는지 비교하는 것. 여기서 tempUid 는 이번에 입력 받은 값을 말한다.
				System.out.println("키와 몸무게를 입력하세요.");
				bmi.setCm(s.nextDouble());
				bmi.setKg(s.nextDouble());
				bmiResult = bmi.calcBMI(bmi.getCm(),bmi.getKg());
				System.out.printf("%s (%s) %s", member.getName(), gender , bmiResult);
				//한석규(남) 과체중
				/* BMI kim = new BMI(); //김유신 BMI hong = new BMI(); //홍길동 BMI
				 song = new BMI(); //송상훈*/
		 	/*
			 * System.out.println("이름,나이,키,몸무게?"); patients[i] = new BMI();
			 * //initialize (초기화) patients[i].name = s.next(); //여기서 name 은 DB에
			 * 직접 받은것. patients[i].age = s.nextInt(); //여기서 name 은 DB에 직접 받은것.
			 * patients[i].cm = s.nextDouble(); //여기서 name 은 DB에 직접 받은것.
			 * patients[i].kg = s.nextDouble(); //여기서 name 은 DB에 직접 받은것.
			 * System.out.printf(patients[i].getResult(patients[i].cm,patients[i
			 * ].kg)); }break;
			 */
				break;
			case 3:
				// lotto
				break;
			case 4:
				ReportCard rep = new ReportCard();
				System.out.println("name : ");
				rep.setName(s.next());
				System.out.println("If the number of subject is 6, Auto quit!!");
				int score = 0, total = 0;
				for (i = 0; i < 6; i++) {
					System.out.println("score : ");
					score = s.nextInt();
					total += score;
				}
				rep.setTotal(total);
				rep.setAverage(total / 6);
				rep.calcGrade();
				System.out.printf("%s %s", "name : ", rep.getName());
				System.out.println("Total : " + rep.getTotal());
				System.out.println("Average : " + rep.getAverage());
				System.out.println("Grade :" + rep.getGrade());
				break;
			}
		}
	}
}

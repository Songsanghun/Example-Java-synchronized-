package test;

import javax.swing.JOptionPane;

public class Controller {

	public static void main(String[] args) { // local variable 반드시 initialize
		int i=0; // for 문을 위해서 : 계속 와일문 안에서 i를 생성하면 안되기 때문에.
		String ssn , bmiResult, gender = ""; // local variable
		Member member=null;    // local variable 로컬 변수가 되는데 이것은 초기화 된다.
		while (true) {
			switch (JOptionPane.showInputDialog("1.회원가입 2.BMI측정 3.로또 4. 성적표 0.종료")) {
			case "0":
				return;
			case "1":
				member = new Member();
				JOptionPane.showInputDialog("이름");
				ssn = JOptionPane.showInputDialog("주민번호");
				while (true) { // validation 유효성 체크
					char ch = ssn.charAt(7);
					if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
						JOptionPane.showMessageDialog(null, "다시 입력하세요.");
					} else {
						break;
					}
				}
				//[1]input ID
				member.setUid(JOptionPane.showInputDialog("아이디"));
				member.setSsn(ssn);
				// [2] calcGender 를 standAlone method
				gender = member.calcGender(ssn);
				
				// String gender = member.getGender(member.ssn);
				JOptionPane.showMessageDialog(null, member.getName()+ "\t" + gender);
				
				break;
			// 한석규(남)
			case "2":
				BMI bmi = new BMI();
				String Uid = "";
				while(true){
					Uid = JOptionPane.showInputDialog("아이디");
					if(member.getUid().equals(Uid)){
						break;
					}else{JOptionPane.showMessageDialog(null, "다시 입력하세요.");}
				}
				bmi.setUid(Uid);
				//member.getUid().equals(tempUid); 아이디가 같는지 비교하는 것. 여기서 tempUid 는 이번에 입력 받은 값을 말한다.
				/*int opt = Integer.parseInt(option); // String을 int 로 바꿔주는거 (""를 벗겨주는거)
				String opt2 = String.valueOf(opt); // int 를 String 로 바꿔주는거 (""를 씌워주는거)
				*/
				bmi.setCm(Integer.parseInt(JOptionPane.showInputDialog("키 (숫자만 입력하세요.)")));
				bmi.setKg(Integer.parseInt(JOptionPane.showInputDialog("몸무게 (숫자만 입력하세요.)")));
				bmiResult = bmi.calcBMI(bmi.getCm(),bmi.getKg());
				JOptionPane.showMessageDialog(null, member.getName()+"\t"+gender+"\t"+bmiResult);
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
			case "3":
				// lotto
				break;
			case "4":
				ReportCard rep = new ReportCard();
				JOptionPane.showInputDialog("name");
				JOptionPane.showMessageDialog(null, "If the number of subject is 6, Auto quit!!");
				int total = 0;
				for (i = 0; i < 6; i++) {
					
					total += Integer.parseInt(JOptionPane.showInputDialog("score"));;
				}
				rep.setTotal(total);
				rep.setAverage(total / 6);
				rep.calcGrade();
				
				JOptionPane.showMessageDialog(null,"name : "+rep.getName()+"\n"
						+ "Total : "+rep.getTotal()+"\n"+"Average : "+rep.getAverage()+"\n"+"Grade :"+rep.getGrade());
				break;
			}
		}
	}
}

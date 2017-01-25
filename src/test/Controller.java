package test;

import javax.swing.JOptionPane;

public class Controller {

	public static void main(String[] args) { // local variable 반드시 initialize 
		int i=0; // for 문을 위해서 : 계속 와일문 안에서 i를 생성하면 안되기 때문에.
		String ssn = "", bmiResult = "", gender = ""; // local variable
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

package bank;

import test.Member;
import javax.swing.*;
public class Controller {
		
	public void start(){
		Member member = null;
		Account account = null;  // null 값은 초기화가 아니라 엄밀히 말하면 null값을 가지고 있는 것이다. 주소지는 있는데 사람이 없는 느낌
		String ssn = "";
		while(true){ //Tomcat 의 방식을 모방
			/*int opt = Integer.parseInt(option); // String을 int 로 바꿔주는거 (""를 벗겨주는거)
			String opt2 = String.valueOf(opt); // int 를 String 로 바꿔주는거 (""를 씌워주는거)
			*/
			switch(JOptionPane.showInputDialog("0.종료 1.회원등록 2.통장개설 3.입금 4.출금 5.조회 6.해지")){
			case "0" : return;
			case "1" : 
				member = new Member();
				;
				while(true){
				ssn = JOptionPane.showInputDialog("주민등록 번호: ");
				char ch = ssn.charAt(7);
				if(ch=='0' ||ch=='7' ||ch=='8' ||ch=='9'){
					JOptionPane.showMessageDialog(null,"다시 입력하세요.");
				}else{
					break;
				}
				}
				member.setSsn(ssn);
				member.setUid(JOptionPane.showInputDialog("아이디"));
				member.setName(JOptionPane.showInputDialog("이름"));
				JOptionPane.showMessageDialog(null,member.getName()+"님 회원등록 되었습니다.");
				break;
			case "2" : 
				String uid = "";
				String accountType = "저축예금";
				account = new Account(uid,accountType);
				
				/*[한빛뱅크] 
					계좌번호 : 123456 
					예금종류 : 저축예금 송상훈님
					가입일 : 2016년 12월 14일
					잔액 : ￦0
				 */
				while(true){
						uid = JOptionPane.showInputDialog("아이디를 입력하세요.");
												
						if(member.getUid().equals(uid)){
							break;
						}else{JOptionPane.showMessageDialog(null,"아이디를 다시 입력하세요.");}
					}
				account.setMoney(0);
				/*
				System.out.printf("["+Account.BANK_NAME+"]\n");
				System.out.printf("계좌번호 : %s\n",account.createAccountNo());
				System.out.printf("예금종류 : %s\t%s\n",accountType,member.getName());
				System.out.printf("가입일 : %s\t%s\n",account.getCreateDate());
				System.out.printf("잔액 : %s\t%s\n",account.getMoney());   System.out.printf = String.format
				*/
				
				StringBuffer sb = new StringBuffer();
				sb.append("["+Account.BANK_NAME+"]\n");
				sb.append(String.format("계좌번호 : %s\n",account.getAccountNo()));
				sb.append(String.format("예금종류 : %s\t%s\n",account.getAccountType(),member.getName()));
				sb.append(String.format("가입일 : %s\n",account.getCreateDate()));
				sb.append(String.format("잔액 : %s\n",account.getMoney()));
				/*System.out.println(sb.toString());*/
				JOptionPane.showMessageDialog(null,sb.toString());
				break;
			case "3" : break;
			case "4" : break;
			case "5" : break;
			case "6" : break;
			}
		}
	}
	
}

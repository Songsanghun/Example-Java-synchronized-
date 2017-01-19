package bank;

import java.util.Scanner;
import test.Member;

public class Controller {
	public static void main(String[] args) {
		Member member = null;
		Account account = null;  // null 값은 초기화가 아니라 엄밀히 말하면 null값을 가지고 있는 것이다. 주소지는 있는데 사람이 없는 느낌
		Scanner s = new Scanner(System.in);
		String ssn = "";
		while(true){ //Tomcat 의 방식을 모방
			System.out.println("0.종료 1.회원등록 2.통장개설 3.입금 4.출금 5.조회 6.해지");
			switch(s.nextInt()){
			case 0 : return;
			case 1 : 
				member = new Member();
				System.out.println("이름 : ");
				while(true){
				System.out.println("주민등록 번호 : ");
				ssn = s.next();
				char ch = ssn.charAt(7);
				if(ch=='0' ||ch=='7' ||ch=='8' ||ch=='9'){
					System.out.println("다시 입력하세요.");
				}else{
					break;
				}
				}
				member.setName(s.next());
				member.setSsn(ssn);
				System.out.println("아이디를 입력하세요.");
				member.setUid(s.next());
				break;
			case 2 : 
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
						System.out.println("아이디를 입력하세요.");
						uid = s.next();
						if(member.getUid().equals(uid)){
							break;
						}else{System.out.println("다시 입력하세요.");}
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
				sb.append(String.format("계좌번호 : %s\n",account.createAccountNo()));
				sb.append(String.format("예금종류 : %s\t%s\n",accountType,member.getName()));
				sb.append(String.format("가입일 : %s\t%s\n",account.getCreateDate()));
				sb.append(String.format("잔액 : %s\t%s\n",account.getMoney()));
				
				System.out.println(sb.toString());
				
				break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 6 : break;
			}
		}
	}
}

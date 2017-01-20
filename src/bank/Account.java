package bank;

import java.util.Calendar;
import util.RandomGenerator;

public class Account {
	public final static String BANK_NAME = "한빛은행";
	private int money , accountNo; 
	private String uid , accountType, createDate;
	public Account(String uid, String accountType){ // 6자리 랜덤 숫자
		this.accountNo = RandomGenerator.getRandomNum(999999,100000); 
		this.createDate = today(); //
		this.uid = uid;
		this.accountType = accountType;
	}
	private String today(){
		//로직을 짜세요.
		return Calendar.getInstance().get(Calendar.YEAR)+"년 "
				+ Calendar.getInstance().get(Calendar.MONTH)+1+"월 "
				+ Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+" 일";
				
		/*StringBuffer today = new StringBuffer();
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		today.append(year);
		today.append("년");
		today.append(month);
		today.append("월");
		today.append(day);
		today.append("일");
		return today.toString();*/
	}
	
	public void setMoney(int money){
		this.money = money;
	}
	public int getMoney(){
		return money;
	}
	public String getCreateDate(){
		return createDate;
	}
	public void setuid(String uid){
		this.uid = uid;
	}
	public String getUid(){
		return uid;
	}
	public String getAccountType(){
		return accountType;
	}
	public int getAccountNo(){
		return accountNo;
	}
	public void deposit(int money){
		
		
	}
	
	
}

package bank;

import java.util.Calendar;

public class Account {
	public final static String BANK_NAME = "한빛은행";
	private int money , accountNo; 
	private String uid , accountType, createDate;
	public Account(String uid, String accountType){ // 6자리 랜덤 숫자
		this.accountNo = createAccountNo(); 
		this.createDate = today(); //
		this.uid = uid;
		this.accountType = accountType;
	}
	private String today(){
		StringBuffer sb = new StringBuffer();
		Calendar now = Calendar.getInstance();
		
		int yy = now.get(now.YEAR);
		int mm = now.get(now.MONTH)+1;
		int dd = now.get(now.DAY_OF_MONTH);
		
		sb.append(yy);
		sb.append("년");
		sb.append(mm);
		sb.append("월");
		sb.append(dd);
		sb.append("일");
		//로직을 짜세요.
		return sb.toString();
	}
	
	public int createAccountNo(){
		int max = 999999;
		int min = 100000;
		accountNo = (int)(Math.random()*(max - min + 1)+min);
		//로직을 짜세요
		//Math.random.... 100000 ~ 999999
		return accountNo;
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
	
	
}

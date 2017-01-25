package bank2;

import java.util.Calendar;
import util.RandomGenerator;

public abstract class Account {
	public final static String BANK_NAME = "한빛은행";
	public final static String ACCONT_TYPE = "통장 베이스";
	public final static String WITHDRAW_FAIL = "잔액부족";
	public final static String DEPOSIT_SUCCESS = "입금성공";
	public final static String DEPOSIT_FAIL = "적합한 입력값이 아님";
	protected int money , accountNo; 
	protected String uid , accountType, createDate;
	public Account() {
		// TODO Auto-generated constructor stub
	}
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
	public abstract boolean checkMoney(int money);
	public abstract String deposit(int money);
	public abstract String withdraw(int money);
	
	/*
	public void deposit(int money){
		this.money+=money;
	}
	public void withdraw(int money){
		this.money=(this.money>money)?this.money-money:this.money;
	}*/
}

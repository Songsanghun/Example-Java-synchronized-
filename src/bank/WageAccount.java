package bank;

import java.util.Calendar;

import util.RandomGenerator;

public class WageAccount extends Account {
	public WageAccount(String uid, String accountType) { // 6자리 랜덤 숫자
		accountNo = RandomGenerator.getRandomNum(999999, 100000);
		createDate = today(); //
		super.uid = uid;
		super.accountType = accountType;
	}

	private String today() {
		// 로직을 짜세요.
		return Calendar.getInstance().get(Calendar.YEAR) + "년 " + Calendar.getInstance().get(Calendar.MONTH) + 1 + "월 "
				+ Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + " 일";
	}

	@Override
	public String deposit(int money) {
		String result = "";
		if(checkMoney(money)){
			this.money += money;
			result = Account.DEPOSIT_SUCCESS;
		}else{
			money = this.money;
			result = Account.DEPOSIT_FAIL;
		}
		return result;
	}

	@Override
	public String withdraw(int money) {
		String result = "";
		if(checkMoney(this.money-money)){
			this.money-=money;
			result = Account.WITHDRAW_FAIL;
		}else{
			this.money=money;
			result = Account.DEPOSIT_FAIL;
		}
		return result;
	}
	/*@Override
	public boolean checkMoney(int money) {
		boolean flag = false;
		if(money>=0){
			flag = true;
		}
		return flag;
	}*/
	
	@Override
	public boolean checkMoney(int money) {
		return money>=0;
	}
}
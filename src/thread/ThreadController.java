package thread;

import java.lang.Thread; //lang 은 이미 자바에서 구현되어있는 아이들
import java.lang.String;

public class ThreadController {
	public static void main(String[] args) {
		ATM atm = new ATM(); // atm은 공유해서 쓴다. 그래서 atm1, atm2이라고  기재하지 않았다.
		Runnable hong = new User("홍길동", atm); 
		Runnable kim = new User("김유신", atm);
		Runnable lee = new User("이순신", atm);
		Thread thr1 = new Thread(hong);    //이 Thread 실이 어느 색인지 구분해주는것 
		thr1.start(); // Thread 는 start 로 시작된다.
		Thread thr2 = new Thread(kim);
		thr2.start();
		Thread thr3 = new Thread(lee); // 데코 패턴 누구인지 표현하려고 ()파라미터 안에 instance가 정의 되어야 한다.
		thr3.start();
		// 비동기화를 나타낸다. 은행창구로 생각하면된다. 결과를 보면 알수있다. F11해봐라. 동기화로 하고 싶으면 ATM메소드에서
		// synchronized를 사용 해라.
		Test t = new Test();
		t.test();
	}
}
class ATM {
	public synchronized void inchul(String name) { 					// synchronized 동기화 키워드 없으면 비 동기화
		System.out.println(name + "님이 인출요청함");
		for (int i = 0; i <= 5; i++) {
			if (i == 5) {
				System.out.println(name + "님이 인출중 입니다.");
			}
		}
		System.out.println(name + "님이 인출해 나감");
	}
}

class User implements Runnable {
	private String name;
	private ATM atm;

	public User(String name, ATM atm) { // association관계 field 에서 선언하고 사용하는것
		super();
		this.atm = atm;
		this.name = name;
	}

	@Override
	public void run() { // dependency 관계
		atm.inchul(name);
	}
}

class Test { // 접근제한자 디폴트로 주면 됨 public 하면 안됨.
	public void test() {
	}
}

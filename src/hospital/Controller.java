package hospital;

import java.util.Scanner;

public class Controller {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("당신의 역할은 무엇입니까?\n"
				+ "1.의사 2.간호사 3.환자" );
		int selector = s.nextInt();
		switch(selector){
		case 1:
			Doctors doc = new Doctors();
			System.out.println("이름, ");
			doc.docName = s.next();
			System.out.println("주민번호는 : ");
			doc.docGen = s.next();
			System.out.println("폰번호는 : ");
			doc.docPhone = s.next();
			System.out.println("이메일은 : ");
			doc.docEmail = s.next();
			System.out.println("직책은 : ");
			doc.docPosition = s.next();
			System.out.println("담당진료과목 : ");
			doc.majorTreat = s.next();
			System.out.println("[의사]" +"\t"+doc.docName+ "(" + doc.getGender(doc.docGen)+")"+doc.docEmail+doc.docPhone);
			
			
		case 2:
			Nurses nur = new Nurses();
			System.out.println("이름 : ");
			nur.nurName = s.next();
			System.out.println("주민번호는 : ");
			nur.nurGen = s.next();
			System.out.println("폰번호는 : ");
			nur.nurPhone = s.next();
			System.out.println("이메일은 : ");
			nur.nurEmail = s.next();
			System.out.println("직책은 : ");
			nur.nurPosition = s.next();
			System.out.println("담당진료과목 : ");
			nur.majorJob = s.next();
			System.out.println("[간호사]" +"\t"+nur.nurName+ "(" + nur.getGender(nur.nurGen)+")"+nur.nurEmail+nur.nurPhone);
		case 3:
			Patient pat = new Patient();
			System.out.println("이름 : ");
			pat.patName = s.next();
			System.out.println("주민번호는 : ");
			pat.patGen = s.next();
			System.out.println("폰번호는 : ");
			pat.patPhone = s.next();
			System.out.println("이메일은 : ");
			pat.patEmail = s.next();
			System.out.println("주소는 : ");
			pat.patAddr = s.next();
			System.out.println("직업 : ");
			pat.patJob = s.next();
			System.out.println("[환자]" +"\t"+pat.patName+ "(" + pat.getGender(pat.patGen)+")"+pat.patEmail+pat.patPhone);
			
		}
	/*	System.out.println("\n역할(의사 :1, 간호사:2, 환자:3)"
				+ "공통 입력 정보"
				+ "이름, 주민번호(800101-1),이메일");*/
		/*
		[의사] 한석규(남) 36세, han@tes,tcom , 010 1234-5678
		[간호사]박신혜(여) 36세, han@tes,tcom , 010 1234-5678
		[환자]한석규(남) 36세, han@tes,tcom , 010 1234-5678
		*/
	}
}

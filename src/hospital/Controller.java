package hospital;

import javax.swing.JOptionPane;

public class Controller {
	public final static String EXE_OPTION=
			"0.EXIT"
			+ "1.REG-DOCTOR\n"
			+ "2.REG-NURSE\n"
			+ "3.REG-PATIENT\n"
			+ "4.CHECK BMI\n";
	public final static String DOC_SPEC=
			 "INPUT AS 의사ID , 담당 진료 과목, 성명 , ssn , 전화번호 ,이메일, 직급";
	public final static String NUR_SPEC=
			 "INPUT AS 간호사ID , 담당 진료 과목, 성명 , ssn , 전화번호 ,이메일, 직급";
	public final static String PAT_SPEC=
			 "INPUT AS 환자ID , 간호사 ID, 의사 ID , 환자성명 , ssn , 주소 , 전화번호 ,이메일, 직업";
	Doctors doc = null;
	Nurses nur = null;
	Patient pat = null;
	public void start() {
		while(true){
			switch(JOptionPane.showInputDialog(EXE_OPTION)){
			case "0": 
				return;
			case "1":
				doc = new Doctors();
				String docInfo = JOptionPane.showInputDialog(DOC_SPEC);
				String[] docInfoArr = docInfo.split(",");
				doc.setUid(Integer.parseInt(docInfoArr[0]));
				doc.setMajorTreat(docInfoArr[1]);
				doc.setName(docInfoArr[2]);
				doc.setSsn(docInfoArr[3]);
				doc.setPhone(docInfoArr[4]);
				doc.setEmail(docInfoArr[5]);
				doc.setDocPosition(docInfoArr[6]);
				JOptionPane.showMessageDialog(null, doc.toString());
				break;			
			case "2":
				nur = new Nurses();
				String nurInfo = JOptionPane.showInputDialog(NUR_SPEC);
				String[] nurInfoArr = nurInfo.split(",");
				nur.setUid(Integer.parseInt(nurInfoArr[0]));
				nur.setMajorJob(nurInfoArr[1]);
				nur.setName(nurInfoArr[2]);
				nur.setSsn(nurInfoArr[3]);
				nur.setPhone(nurInfoArr[4]);
				nur.setEmail(nurInfoArr[5]);
				nur.setNurPosition(nurInfoArr[6]);
				JOptionPane.showMessageDialog(null, nur.toString());
				break;
			case "3":
				pat = new Patient();
				String patInfo = JOptionPane.showInputDialog(PAT_SPEC);
				String[] patInfoArr = patInfo.split(",");
				pat.setUid(Integer.parseInt(patInfoArr[0]));
				pat.setNur_id(Integer.parseInt(patInfoArr[1]));
				pat.setDoc_id(Integer.parseInt(patInfoArr[2]));
				pat.setName(patInfoArr[3]);
				pat.setSsn(patInfoArr[4]);
				pat.setAddr(patInfoArr[5]);
				pat.setPhone(patInfoArr[6]);
				pat.setEmail(patInfoArr[7]);
				pat.setPatJob(patInfoArr[8]);
				JOptionPane.showMessageDialog(null, pat.toString());
				break;
			case "4": 
				BMI bmi = new BMI();
				bmi.setCm((Double.parseDouble(JOptionPane.showInputDialog("키를 입력해주세요.")))/100);
				bmi.setKg(Double.parseDouble(JOptionPane.showInputDialog("몸무게를 입력해주세요.")));
				JOptionPane.showMessageDialog(null,bmi.treat());
				break;
			}
		/*	System.out.println("\n역할(의사 :1, 간호사:2, 환자:3)"
					+ "공통 입력 정보"
					+ "이름, 주민번호(800101-1),이메일");*/
			/*
			[의사] 한석규(남) 1980년생, han@tes,tcom , 010 1234-5678
			[간호사]박신혜(여) 36세, han@tes,tcom , 010 1234-5678
			[환자]한석규(남) 36세, han@tes,tcom , 010 1234-5678
			*/
		}
		}
}

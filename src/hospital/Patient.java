package hospital;

public class Patient extends Member{
	String patJob;
	int nur_id, doc_id;
	
	public void setPatJob(String patJob){
		this.patJob = patJob;
	}
	public String getPatJob(){
		return patJob;
	}
	public void setNur_id(int nur_id){
		this.nur_id = nur_id;
	}
	public int getNur_id(){
		return nur_id;
	}
	public void setDoc_id(int doc_id){
		this.doc_id = doc_id;
	}
	public int getDoc_id(){
		return doc_id;
	}
	
	@Override
	public String toString() {
		return String.format(
				"환자ID : %s\n"
				+ "간호사 ID : %n"
				+ "의사 ID : %s\n"
				+ "환자성명 : %s\n"
				+ "주민번호(800101-1)"
				+ "주소 : %s\n"
				+ "전화번호 : %s\n"
				+ "이메일 : %s\n"
				+ "직업 : %s\n",
				uid,
				nur_id,
				doc_id,
				name,
				ssn,
				addr,
				phone,
				email,
				patJob
				);
	}
	
	
}

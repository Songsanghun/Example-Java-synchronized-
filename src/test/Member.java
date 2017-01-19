package test;

public class Member {
	private String ssn, name, uid;

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUid() {
		return uid;
	}

	public String calcGender(String ssn) {
		char ch = ssn.charAt(7);
		String gender = "";
		if (ch == '1' || ch == '3') {
			gender = "남자";
		} else if (ch == '2' || ch == '4') {
			gender = "여자";
		} else if (ch == '5' || ch == '6') {
			gender = "외국인";
		} else {
			gender = "올바른숫자가 아닙니다.";
		}
		return gender;
	}

}
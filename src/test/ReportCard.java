package test;

public class ReportCard {
	private String name;
	private int score, total, average;
	private char grade;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotal() {
		return total;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public int getAverage() {
		return average;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void calcGrade() {
		if (average >= 90) {
			grade = 'A';
		} else if (average >= 80) {
			grade = 'B';
		} else if (average >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
	}
}

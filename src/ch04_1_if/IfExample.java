package ch04_1_if;

public class IfExample {
	public static void main(String[] args) {

		int score = 55;
		char grade = 'F';
//		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C' ) ;

		if (score > 90) {
			grade = 'A';
		} else if (score >= 80 && score < 90) {
			grade = 'B';
		} else if (score >= 70 && score < 80) {
			grade = 'C';
		} else if (score >= 60 && score < 70) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(grade);

	}
}